package com.example.myart

import com.example.myart.repository.GenreResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface Service {
    @get:Headers("Content-Type: application/json")
    @get:GET("3/movie/550?api_key=b25438f366b7d3b21111047f0342c590")
    val genres: Call<GenreResponse?>?
}