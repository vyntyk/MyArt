package com.example.myart.repository

import android.content.Context
import com.example.myart.Genre

interface Repository {
    fun getGenre(context: Context, data: (MutableList<Genre>) -> Unit)
}