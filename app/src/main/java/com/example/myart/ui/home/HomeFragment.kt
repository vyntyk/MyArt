package com.example.myart.ui.home
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myart.MyRecyclerViewAdapter
import com.example.myart.MyRecyclerViewAdapter.ItemClickListener
import com.example.myart.R
import com.example.myart.repository.Repository
import com.example.myart.repository.impl.RepositoryImpl

class HomeFragment : Fragment(), ItemClickListener {
    private var homeViewModel: HomeViewModel? = null
    private val adapter: MyRecyclerViewAdapter = MyRecyclerViewAdapter()
    override fun onItemClick(view: View?, position: Int) {
        Toast.makeText(
            context, "You clicked " + adapter!!.getItem(position) +
                    " on row number " + position, Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository: Repository = RepositoryImpl()
        repository.getGenre(requireContext()) { data -> adapter.setData(data) }
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
}