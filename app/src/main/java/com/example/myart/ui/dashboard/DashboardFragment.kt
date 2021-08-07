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
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myart.MainActivity
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class DashboardFragment : Fragment() {
    private var dashboardViewModel: DashboardViewModel? = null
    private val viewHolder: Any? = null
    private val container: FrameLayout? = null
    private val constraintLayout: ConstraintLayout? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val textView = root.findViewById<TextView>(R.id.text_dashboard)
        return root
    }
}

