package com.example.myart.repository

import com.example.myart.ui.home.HomeFragment.SetData

interface Repository {
    fun getGenre(lambda: SetData?)
}