package com.example.myart.repository.impl

import android.util.Log
import com.example.myart.ui.home.HomeFragment.SetData
import com.example.myart.ApiUtils
import com.example.myart.repository.GenreResponse
import com.example.myart.Genre
import com.example.myart.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryImpl : Repository {
    companion object {
        fun getGenre(lambda: SetData) {
           ApiUtils.apiService.genres!!.enqueue(object : Callback<GenreResponse> {
               override fun onResponse(
                   call: Call<GenreResponse>,
                   response: Response<GenreResponse>
               ) {
                   if (response.isSuccessful) {
                       val data: List<Genre?> = response.body()!!.genres
                       lambda.setData(data)
                   }
               }

               override fun onFailure(call: Call<GenreResponse>, t: Throwable) {
                   Log.e("TAG", "ERROR")
               }
           })
       }
    }

    override fun getGenre(lambda: SetData?) {
        TODO("Not yet implemented")
    }
}

private fun <T> Call<T>.enqueue(callback: Callback<GenreResponse>) {

}


