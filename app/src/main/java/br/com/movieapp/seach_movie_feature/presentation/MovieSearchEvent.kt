package br.com.movieapp.seach_movie_feature.presentation

sealed class MovieSearchEvent {
    data class EnteredQuery(val value: String): MovieSearchEvent()
}