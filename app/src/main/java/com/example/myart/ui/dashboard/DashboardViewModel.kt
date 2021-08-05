package com.example.myart.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import com.example.myart.ui.dashboard.DashboardViewModel
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.myart.R
import android.widget.TextView
import com.example.myart.ui.notifications.NotificationsViewModel
import com.example.myart.ui.home.HomeFragment.SetData
import retrofit2.Retrofit
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import android.content.Intent
import com.example.myart.MainActivity
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class DashboardViewModel : ViewModel() {
    fun getText(): Any {

    }

    private val mText: MutableLiveData<String?>
    val text: LiveData<String?>
        get() = mText

    init {
        mText = MutableLiveData()
        mText.value = "This is dashboard fragment"
    }
}