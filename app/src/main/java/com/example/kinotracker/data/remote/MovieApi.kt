package com.example.kinotracker.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String,
        @Query("language") language: String = "ru-RU"
    ): MovieListDto

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
    }
}