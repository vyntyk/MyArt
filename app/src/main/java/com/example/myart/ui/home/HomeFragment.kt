package com.example.myart.ui.home
import com.example.myart.MyRecyclerViewAdapter.ItemClickListener
import com.example.myart.ui.home.HomeViewModel
import com.example.myart.MyRecyclerViewAdapter
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.Toast
import android.os.Bundle
import com.example.myart.ui.home.HomeFragment.SetData
import com.example.myart.Genre
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myart.R
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myart.repository.Repository
import com.example.myart.repository.impl.RepositoryImpl

class HomeFragment : Fragment(), ItemClickListener {
    private var homeViewModel: HomeViewModel? = null
    private var adapter: MyRecyclerViewAdapter? = null
    private val container: FrameLayout? = null
    private val constraintLayout: ConstraintLayout? = null
    override fun onItemClick(view: View?, position: Int) {
        Toast.makeText(
            context, "You clicked " + adapter!!.getItem(position) +
                    " on row number " + position, Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository: Repository = RepositoryImpl()
                adapter = MyRecyclerViewAdapter()
        val lambda = object : SetData {
            override fun setData(data: List<Genre?>?) {
                adapter!!.setData(data as List<Genre>)
            }
        }
        repository.getGenre(lambda)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView: RecyclerView = root.findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
        adapter!!.setClickListener(this)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    interface SetData {
        fun setData(data: List<Genre?>?)
    }
}