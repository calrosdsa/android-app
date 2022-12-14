package com.teclu.data.android.preferences

import androidx.datastore.core.CorruptionException
import androidx.datastore.core.Serializer
import com.google.crypto.tink.Aead
import com.teclu.constants.Screen
import com.teclu.enums.Roles
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.protobuf.ProtoBuf
import java.io.InputStream
import java.io.OutputStream

@Serializable
data class UserObject(
   @SerialName("UserObjectname") val username:String="Jhon",
   @SerialName("role") val role:Roles=Roles.CLIENTE,
   @SerialName("token") val token:String="",
   @SerialName("id") val id:String="Jhon11",
   @SerialName("initialScreen") val initialScreen:String = Screen.Login.route
)
@OptIn(ExperimentalSerializationApi::class)
class UserObjectSerializer(private val aead: Aead) : Serializer<UserObject> {
   override suspend fun readFrom(input: InputStream): UserObject {
      return try {
         val encryptedInput = input.readBytes()

         val decryptedInput = if (encryptedInput.isNotEmpty()) {
            aead.decrypt(encryptedInput, null)
         } else {
            encryptedInput
         }

         ProtoBuf.decodeFromByteArray(UserObject.serializer(), decryptedInput)
      } catch (e: SerializationException) {
         throw CorruptionException("Error deserializing proto", e)
      }
   }

   override suspend fun writeTo(t: UserObject, output: OutputStream) {
      val byteArray = ProtoBuf.encodeToByteArray(UserObject.serializer(), t)
      val encryptedBytes = aead.encrypt(byteArray, null)

      withContext(Dispatchers.IO) {
         output.write(encryptedBytes)
      }
   }

   override val defaultValue: UserObject =
      UserObject()
}

