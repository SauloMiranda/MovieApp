package com.afirmo.movieapp.framework.util

import timber.log.Timber

class Util {

    fun logError(tag: String, message: String) {
        Timber.tag(tag).e(message)
    }

    fun logInfo(tag: String, message: String) {
        Timber.tag(tag).i(message)
    }

}