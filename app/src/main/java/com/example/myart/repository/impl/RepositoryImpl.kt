package com.example.myart.repository.impl;
import android.util.Log;

import com.example.myart.ApiUtils;
import com.example.myart.Genre;
import com.example.myart.repository.GenreResponse;
import com.example.myart.repository.Repository;
import com.example.myart.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepositoryImpl implements Repository {

    @Override
    public void getGenre(HomeFragment.SetData lambda) {
        ApiUtils.getApiService().getGenres().enqueue(
                new Callback<GenreResponse>() {
                    @Override
                    public void onResponse(Call<GenreResponse> call, Response<GenreResponse> response) {
                        if (response.isSuccessful()) {
                            List<Genre> data = response.body().getGenres();
                            lambda.setData(data);
                        }
                    }

                    @Override
                    public void onFailure(Call<GenreResponse> call, Throwable t) {
                        Log.e("TAG", "ERROR");
                    }
                }
        );
    }
}




