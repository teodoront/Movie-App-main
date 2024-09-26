package br.com.movieapp.seach_movie_feature.domain.source

import br.com.movieapp.core.data.remote.response.SearchResponse
import br.com.movieapp.core.paging.MovieSearchPaginSource

interface MovieSearchRemoteDataSource {
    fun getSearchMoviePaginSource(query: String): MovieSearchPaginSource
    suspend fun getSearchMovies(page: Int?, query: String): SearchResponse
}