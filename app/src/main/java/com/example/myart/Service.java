package com.example.myart;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {
    String getGenre = null;

    @GET("https://api.themoviedb.org/3/movie/550")
    Call<Genre> getGenre(
            @Query("id") String datas


    );
}
