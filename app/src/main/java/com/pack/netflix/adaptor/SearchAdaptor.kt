package com.pack.netflix.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pack.netflix.databinding.SearchItemBinding

class SearchAdaptor(private val context: Context, var searchList: List<String>) :
    RecyclerView.Adapter<SearchAdaptor.SearchHolder>() {
    inner class SearchHolder(private val binding: SearchItemBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchHolder {
        var view = SearchItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return SearchHolder(view)
    }

    override fun getItemCount(): Int {
        return searchList.size
    }

    override fun onBindViewHolder(holder: SearchHolder, position: Int) {

    }
}