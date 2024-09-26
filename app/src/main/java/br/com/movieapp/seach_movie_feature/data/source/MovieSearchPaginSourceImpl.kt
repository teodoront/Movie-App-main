package br.com.movieapp.seach_movie_feature.data.source


import br.com.movieapp.core.data.remote.MovieService
import br.com.movieapp.core.data.remote.response.SearchResponse
import br.com.movieapp.core.paging.MovieSearchPaginSource
import br.com.movieapp.seach_movie_feature.domain.source.MovieSearchRemoteDataSource
import javax.inject.Inject

class MovieSearchPaginSourceImpl @Inject constructor(
    private val service: MovieService
) : MovieSearchRemoteDataSource {
    override fun getSearchMoviePaginSource(query: String): MovieSearchPaginSource {
       return MovieSearchPaginSource(query = query, remoteDataSource = this)
    }

    override suspend fun getSearchMovies(page: Int?, query: String): SearchResponse {
        return service.searchMovie(page = page, query = query)
    }
}