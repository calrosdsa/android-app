package com.teclu.data.android.preferences


import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.util.Log
import coil.ImageLoader
import coil.request.ErrorResult
import coil.request.ImageRequest
import coil.request.SuccessResult
import com.teclu.interfaces.AppUtil
import com.teclu.util.AppCoroutineDispatchers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import javax.inject.Inject
class AppUtilImpl @Inject constructor(
    private val dispatchers: AppCoroutineDispatchers
    //  @ApplicationContext private val context: ApplicationContext
): AppUtil {
    //    private val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    override suspend fun getImageBitmap(context: Context, imageUrl: String?): Bitmap? {
        if (imageUrl == "" || imageUrl == null) return null
        val loading = ImageLoader(context)
        val request = ImageRequest.Builder(context)
            .data(imageUrl)
//            .allowHardware(true)
//            .allowConversionToBitmap()
            .build()
        val result = loading.execute(request)
        if (result is SuccessResult) {
            return (result.drawable as BitmapDrawable).bitmap
        } else if (result is ErrorResult) {
            return null
        }
        return null
    }
}
//        val result = (loading.execute(request) as SuccessResult).drawable
//        return  (result as BitmapDrawable).bitmap
//    Log.d("DEBUG_DD",bitmap.toString())

//    override suspend fun formatDateOffset(): OffsetDateTime {
//        val formatter = DateTimeFormatter
//            .ofPattern("dd/MM/uuuu HH:mm:ss.SSSXXXXX");
//        val dateString = "03/08/2019T16:20:17:717+05:30"
//        val odtInstanceAtOffset = OffsetDateTime.parse(dateString, formatter)
//        return odtInstanceAtOffset.withOffsetSameInstant(ZoneOffset.UTC)
//        //val dateStringInUTC: String = odtInstanceAtUTC.format(DATE_TIME_FORMATTER)
//    }
