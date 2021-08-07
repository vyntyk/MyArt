package com.example.myart.repository.impl

import android.content.Context
import android.os.Handler
import android.util.Log
import com.example.myart.ApiUtils
import com.example.myart.Genre
import com.example.myart.repository.GenreResponse
import com.example.myart.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryImpl : Repository {
    override fun getGenre(context: Context, function: (MutableList<Genre>) -> Unit) {
        ApiUtils.apiService.genres?.enqueue(object : Callback<GenreResponse?> {

            override fun onResponse(
                call: Call<GenreResponse?>,
                response: Response<GenreResponse?>
            ) {
                if (response.isSuccessful) {
                    val genres = response.body()!!.genres
                    Handler(context.mainLooper).post { function.invoke(genres) }
                }
            }

            override fun onFailure(call: Call<GenreResponse?>, t: Throwable) {
                Log.e("TAG", "ERROR")
            }

        })
    }

}



