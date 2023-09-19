package com.pack.netflix.adaptor

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pack.netflix.databinding.FunnyClipsMoviesBinding

class PriviewAdaptor(private var context: Context, var previewsList: List<String>) :
    RecyclerView.Adapter<PriviewAdaptor.ViewHolder>() {
   inner class ViewHolder(val binding: FunnyClipsMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = FunnyClipsMoviesBinding.inflate(LayoutInflater.from(context), parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int {
        return previewsList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("PriviewAdaptor", ", list Size ${previewsList.size}")
    }
}