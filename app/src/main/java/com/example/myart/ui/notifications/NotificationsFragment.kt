package com.example.myart.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myart.R

class NotificationsFragment : Fragment() {
    private var notificationsViewModel: NotificationsViewModel? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel = ViewModelProvider(this).get(
            NotificationsViewModel::class.java
        )
        val view = inflater.inflate(R.layout.fragment_notifications, container, false)
        val textView = view.findViewById<TextView>(R.id.text_notifications)
        return view
    }
}