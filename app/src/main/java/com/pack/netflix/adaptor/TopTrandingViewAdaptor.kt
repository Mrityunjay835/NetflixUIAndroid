package com.pack.netflix.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pack.netflix.databinding.TopTrandingViewBinding

class TopTrandingViewAdaptor(private var context: Context, private var moviesList: List<String>) :
    RecyclerView.Adapter<TopTrandingViewAdaptor.TopTrandingViewHolder>() {
    class TopTrandingViewHolder(var binding: TopTrandingViewBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopTrandingViewHolder {
        var view = TopTrandingViewBinding.inflate(LayoutInflater.from(context),parent,false)
        return TopTrandingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    override fun onBindViewHolder(holder: TopTrandingViewHolder, position: Int) {
        holder.binding.tvTrandingPosition.text= (position+1).toString()
    }
}