package com.example.kinotracker.presentation

import com.example.kinotracker.domain.model.Movie

sealed class MoviesState {
    object Loading : MoviesState() // Проверь, что это object
    data class Success(val movies: List<Movie>) : MoviesState() // Это data class
    data class Error(val message: String) : MoviesState() // Это data class
}