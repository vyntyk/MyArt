package com.example.myart;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("https://api.themoviedb.org/3/movie/550")
    Call<Genre> getGenre(
           // @Query("api_key") String API_KEY


    );
}
