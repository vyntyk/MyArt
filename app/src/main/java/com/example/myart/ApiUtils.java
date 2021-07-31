package com.example.myart;

public class ApiUtils {
    public static final String BASE_URL = "https://api.themoviedb.org/3/movie/550";

    public static Service getService() {
        return RetrofitClient.getClient(BASE_URL).create(Service.class);
    }
}
