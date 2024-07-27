package com.afirmo.movieapp.framework.data.remote

import com.afirmo.movieapp.BuildConfig
import com.afirmo.movieapp.framework.util.Constants
import okhttp3.Interceptor
import okhttp3.Response

class ParamsInterceptor :Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val url = request.url.newBuilder()
            .addQueryParameter(Constants.APIKEY_PARAN, BuildConfig.API_KEY)
            .addQueryParameter(Constants.LANGUAGE_PARAM, Constants.LANGUAGE_VALUE)
            .build()

        return chain.proceed(request.newBuilder().url(url).build())
    }
}