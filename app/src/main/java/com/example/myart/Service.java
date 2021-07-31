package com.example.myart;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {
    @GET("list")
    Call<Genre> getGenres(
            @Query("api_key") String API_KEY,
            @Query("language") String language
    );
}
