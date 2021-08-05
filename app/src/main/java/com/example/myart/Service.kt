package com.example.myart;

import com.example.myart.repository.GenreResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Service {

     @GET("3/movie/550?api_key=b25438f366b7d3b21111047f0342c590")
     @Headers("Content-Type: application/json")
     Call<GenreResponse> getGenres();
}
