package com.example.kinotracker.data.repository

import com.example.kinotracker.data.mapper.toMovie
import com.example.kinotracker.data.remote.MovieApi
import com.example.kinotracker.domain.model.Movie
import com.example.kinotracker.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val api: MovieApi
) : MovieRepository {

    override suspend fun getPopularMovies(): List<Movie> {
        return try {
            // Попытка загрузить из сети
            val response = api.getPopularMovies(apiKey = "f3c092a958a03ef2f18243cb9c56940a")
            response.results.map { it.toMovie() }
        } catch (e: Exception) {
            // Если сеть не работает (нет VPN, нет связи), показываем это:
            listOf(
                Movie(
                    id = 1,
                    title = "Ошибка сети (Режим Оффлайн)",
                    overview = "Не удалось загрузить данные из TMDB. Проверьте VPN или подключение.",
                    posterPath = "https://via.placeholder.com/500x750.png?text=No+Internet",
                    voteAverage = 0.0
                ),
                Movie(
                    id = 2,
                    title = "Интерстеллар (Локально)",
                    overview = "Группа исследователей отправляется через червоточину...",
                    posterPath = "https://image.tmdb.org/t/p/w500/gEU2QvYBeb9nBvMv9pnuvS1aCPL.jpg",
                    voteAverage = 8.6
                )
            )
        }
    }
}