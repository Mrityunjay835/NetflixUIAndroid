package com.pack.netflix.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pack.netflix.databinding.ContinueWatchingViewBinding

class ContinueWatchingAdaptor(
    private val context: Context,
    private var continueList: List<String>
) : RecyclerView.Adapter<ContinueWatchingAdaptor.ContinueWatchingHolder>() {
    class ContinueWatchingHolder(val binding: ContinueWatchingViewBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContinueWatchingHolder {
        var view = ContinueWatchingViewBinding.inflate(LayoutInflater.from(context),parent,false)
        return ContinueWatchingHolder(view)
    }

    override fun getItemCount(): Int {
       return continueList.size
    }

    override fun onBindViewHolder(holder: ContinueWatchingHolder, position: Int) {

    }

}