package com.example.kinotracker.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinotracker.domain.model.Movie
import com.example.kinotracker.domain.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val repository: MovieRepository
) : ViewModel() {

    private val _state = MutableStateFlow<MoviesState>(MoviesState.Loading)
    val state: StateFlow<MoviesState> = _state

    init {
        loadMovies()
    }

    fun loadMovies() {
        viewModelScope.launch {
            _state.value = MoviesState.Loading
            try {
                val result = repository.getPopularMovies()
                if (result.isEmpty()) {
                    _state.value = MoviesState.Error("Список пуст. Проверьте VPN.")
                } else {
                    _state.value = MoviesState.Success(result)
                }
            } catch (e: Exception) {
                _state.value = MoviesState.Error("Ошибка: ${e.localizedMessage}")
            }
        }
    }
}