package com.example.myart;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Service {

     @GET("./api_key")
     @Headers("Content-Type: application/json")
     Call<Genre> getGenre();
}
