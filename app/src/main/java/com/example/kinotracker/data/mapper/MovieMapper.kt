package com.example.kinotracker.data.mapper

import com.example.kinotracker.data.remote.MovieDto
import com.example.kinotracker.domain.model.Movie

fun MovieDto.toMovie(): Movie {
    return Movie(
        id = id ?: 0,
        title = title ?: "No Title",
        overview = overview ?: "No Description",
        posterPath = "https://image.tmdb.org/t/p/w500${posterPath ?: ""}",
        voteAverage = voteAverage ?: 0.0
    )
}