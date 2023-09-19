package com.pack.netflix.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pack.netflix.databinding.CommonMoviesViewBinding

class CommonViewAdaptor(private val context: Context, private var moviesList: List<String> ):RecyclerView.Adapter<CommonViewAdaptor.CommomViewHolder>() {

    class CommomViewHolder(private var binding: CommonMoviesViewBinding): RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommomViewHolder {
        var view = CommonMoviesViewBinding.inflate(LayoutInflater.from(context),parent,false)
        return CommomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    override fun onBindViewHolder(holder: CommomViewHolder, position: Int) {

    }
}