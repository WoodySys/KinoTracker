package com.example.kinotracker.domain.repository

import com.example.kinotracker.domain.model.Movie

interface MovieRepository {
    suspend fun getPopularMovies(): List<Movie>
}