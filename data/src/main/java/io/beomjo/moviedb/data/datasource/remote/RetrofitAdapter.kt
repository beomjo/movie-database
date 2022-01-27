package io.beomjo.moviedb.data.datasource.remote

import com.google.gson.GsonBuilder
import io.beomjo.moviedb.data.BuildConfig
import okhttp3.Interceptor
import okhttp3.JavaNetCookieJar
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.CookieManager
import java.net.CookiePolicy
import java.util.*
import java.util.concurrent.TimeUnit

internal object RetrofitAdapter {
    private const val TIMEOUT: Long = 10

    fun getInstance(baseUrl: String, apiKey: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(getOkHttpClient(apiKey))
            .addConverterFactory(getGsonConvertFactory())
            .build()
    }

    private fun getOkHttpClient(apiKey: String): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .cookieJar(JavaNetCookieJar(getCookieManager()))
            .addInterceptor(getHttpLoggingInterceptor())
            .addInterceptor { getRequestInterceptor(it, apiKey) }
            .build()
    }

    private fun getGsonConvertFactory(): GsonConverterFactory {
        val gson = GsonBuilder().create()
        return GsonConverterFactory.create(gson)
    }

    private fun getCookieManager(): CookieManager {
        return CookieManager().apply {
            setCookiePolicy(CookiePolicy.ACCEPT_ALL)
        }
    }

    private fun getHttpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
        }
    }

    private fun getRequestInterceptor(chain: Interceptor.Chain, apiKey: String): Response {
        return chain.request().let { originRequest ->
            chain.proceed(
                originRequest.newBuilder()
                    .url(
                        originRequest.url
                            .newBuilder()
                            .addQueryParameter("api_key", apiKey)
                            .addQueryParameter("region", getRegion())
                            .build()
                    )
                    .build()
            )
        }
    }

    private fun getRegion(): String? = try {
        Locale.getDefault().country.substring(0, 2)
    } catch (t: Throwable) {
        null
    }
}