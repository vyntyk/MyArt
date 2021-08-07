package com.example.myart

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myart.MyRecyclerViewAdapter.MyViewHolder

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyViewHolder>() {
    private var mData: MutableList<Genre> = mutableListOf()
    private var mClickListener: ItemClickListener? = null

    fun setData(data: MutableList<Genre>) {
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
        Log.d("TAG", "mData = ${mData}")
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