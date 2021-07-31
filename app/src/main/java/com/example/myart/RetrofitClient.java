package com.example.myart;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static final String API_KEY = "b25438f366b7d3b21111047f0342c590";
    private static Retrofit retrofit = null;
    public static final String BASE_URL = "https://api.themoviedb.org/3/movie/550";

    public static Retrofit getClient(String baseUrl) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        //System.out.println(retrofit);
        return retrofit;
    }
}
