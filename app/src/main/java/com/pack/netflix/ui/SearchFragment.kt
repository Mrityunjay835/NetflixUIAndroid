package com.pack.netflix.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pack.netflix.R
import com.pack.netflix.adaptor.SearchAdaptor
import com.pack.netflix.databinding.FragmentSearchBinding
import com.pack.netflix.databinding.SearchItemBinding
import com.pack.netflix.sampleData.ListOfString

class SearchFragment : Fragment() {

    private lateinit var binding : FragmentSearchBinding

    private val rvSearchAdaptor by lazy{
        SearchAdaptor(requireContext(),ListOfString.strings)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvSearchItems.adapter=rvSearchAdaptor
        rvSearchAdaptor.notifyDataSetChanged()

    }

    companion object {
        @JvmStatic
        fun newInstance() = SearchFragment()
    }
}