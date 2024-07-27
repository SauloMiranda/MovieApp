package com.afirmo.movieapp.framework.domain

data class MovieDetails(
    val id: Int,
    val title: Int,
    val genre: List<String>,
    val overview: String,
    val releaseDate: String,
    val voteAverage: Double,
    val imageUrl: String,
    val backdropUrl: String,
    val videoUrl: String,
    val duration: String,
    val voteCount: Int,
)