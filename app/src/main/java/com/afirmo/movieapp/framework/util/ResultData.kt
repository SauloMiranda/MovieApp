package com.afirmo.movieapp.framework.util

sealed class ResultData<out T> {

    object Loading : ResultData<Nothing>()
    data class Success<T>(val data: T) : ResultData<T>()
    data class Error(val exception: Exception) : ResultData<Nothing>()

}