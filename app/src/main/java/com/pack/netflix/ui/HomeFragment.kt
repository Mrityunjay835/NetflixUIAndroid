package com.pack.netflix.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pack.netflix.adaptor.CommonViewAdaptor
import com.pack.netflix.adaptor.ContinueWatchingAdaptor
import com.pack.netflix.adaptor.PriviewAdaptor
import com.pack.netflix.adaptor.TopTrandingViewAdaptor
import com.pack.netflix.databinding.FragmentHomeBinding
import com.pack.netflix.sampleData.ListOfString


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    private val previewAdaptor by lazy {
        PriviewAdaptor(requireActivity(), ListOfString.strings)
    }

    private val continueAdaptor by lazy{
        ContinueWatchingAdaptor(requireActivity(), ListOfString.strings)
    }

    private val topTenTrandingAdaptor by lazy {
        TopTrandingViewAdaptor(requireActivity(), ListOfString.strings)
    }

    private val commonMoviesViewAdaptor by lazy {
        CommonViewAdaptor(requireActivity(), ListOfString.strings)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


//    use this for assigning other things like adapter, view etc...
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvPreviews.adapter = previewAdaptor
        previewAdaptor.notifyDataSetChanged()


        binding.rvContinueWatching.adapter = continueAdaptor
        continueAdaptor.notifyDataSetChanged()


        binding.rvTopTranding.adapter = topTenTrandingAdaptor
        topTenTrandingAdaptor.notifyDataSetChanged()

        binding.rvNewReleases.adapter = commonMoviesViewAdaptor
        commonMoviesViewAdaptor.notifyDataSetChanged()
    }


    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}