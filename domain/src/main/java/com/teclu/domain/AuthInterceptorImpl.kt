package com.teclu.domain
//
//import androidx.datastore.core.DataStore
//import com.teclu.domain.preferences.UserObject
//import kotlinx.coroutines.coroutineScope
//import kotlinx.coroutines.flow.Flow
//import kotlinx.coroutines.flow.catch
//import okhttp3.Interceptor
//import okhttp3.Response
//import java.io.IOException
//import java.net.HttpURLConnection
//import javax.inject.Inject
//
//class AuthInterceptorImpl @Inject constructor(
//    private val  userDataStore: DataStore<UserObject>
//) : Interceptor {
//    private val userDataFlow: Flow<UserObject> by lazy {
//        userDataStore.data.catch { e ->
//            if (e is IOException) {
//                emit(UserObject())
//            } else {
//                throw e
//            }
//        }
//    }
//
//
//    override fun intercept(chain: Interceptor.Chain): Response {
//        val request = chain.request()
//        var token:String
//        coroutineScope {
//        var accessToken = userDataFlow.collect{
//                token = it.token
//        }
//        }
//
//        val response = chain.proceed(newRequestWithAccessToken(accessToken, request))
//
//        if (response.code == HttpURLConnection.HTTP_UNAUTHORIZED) {
//            val newAccessToken = sessionManager.getAccessToken()
//            if (newAccessToken != accessToken) {
//                return chain.proceed(newRequestWithAccessToken(accessToken, request))
//            } else {
//                accessToken = refreshToken()
//                if (accessToken.isNullOrBlank()) {
//                    sessionManager.logout()
//                    return response
//                }
//                return chain.proceed(newRequestWithAccessToken(accessToken, request))
//            }
//        }
//
//        return response
//    }
//
//    private fun newRequestWithAccessToken(accessToken: String?, request: Request): Request =
//        request.newBuilder()
//            .header("Authorization", "Bearer $accessToken")
//            .build()
//
//    private fun refreshToken(): String? {
//        synchronized(this) {
//            val refreshToken = sessionManager.getRefreshToken()
//            refreshToken?.let {
//                return sessionManager.refreshToken(refreshToken)
//            } ?: return null
//        }
//    }
//}