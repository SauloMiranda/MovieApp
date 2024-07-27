package com.afirmo.movieapp.framework.util

import com.afirmo.movieapp.BuildConfig

fun String?.toPostUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"
fun String?.toBackdropUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"