package com.example.myart

import androidx.recyclerview.widget.RecyclerView
import com.example.myart.MyRecyclerViewAdapter.MyViewHolder
import com.example.myart.Genre
import com.example.myart.MyRecyclerViewAdapter.ItemClickListener
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.example.myart.R
import android.widget.TextView
import java.util.ArrayList

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyViewHolder>() {
    private var mData: List<Genre> = ArrayList()
    private var mClickListener: ItemClickListener? = null
    fun setData(data: List<Genre>) {
        mData = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val genre = mData[position]
        holder.myTextView.text = genre.name + " " + genre.id
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    // stores and recycles views as they are scrolled off screen
    inner class MyViewHolder internal constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var myTextView: TextView
        override fun onClick(view: View) {
            if (mClickListener != null) mClickListener!!.onItemClick(view, adapterPosition)
        }

        init {
            myTextView = itemView.findViewById(R.id.title)
            itemView.setOnClickListener(this)
        }
    }

    // convenience method for getting data at click position
    fun getItem(id: Int): Genre {
        return mData[id]
    }

    //    allows clicks events to be caught
    fun setClickListener(itemClickListener: ItemClickListener?) {
        mClickListener = itemClickListener
    }

    // parent activity will implement this method to respond to click events
    interface ItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }
}