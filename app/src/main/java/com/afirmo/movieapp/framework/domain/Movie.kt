package com.afirmo.movieapp.framework.domain

data class Movie(
    val id:Int,
    val title:String,
    val voteAverage:Double = 0.0,
    val imageUrl:String = ""
)
