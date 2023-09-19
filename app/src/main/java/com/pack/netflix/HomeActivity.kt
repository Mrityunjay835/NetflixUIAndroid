package com.pack.netflix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.pack.netflix.databinding.ActivityMainBinding
import com.pack.netflix.ui.HomeFragment
import com.pack.netflix.ui.InspireFragment
import com.pack.netflix.ui.SearchFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState==null){
            var fragment = HomeFragment.newInstance()
            val fragmentManager: FragmentManager = supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.commit()
        }

        binding.bottomNavigation.clHome.setOnClickListener {
            if(savedInstanceState==null){
                var fragment = HomeFragment.newInstance()
                val fragmentManager: FragmentManager = supportFragmentManager
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.fragmentContainer, fragment)
                fragmentTransaction.commit()
            }
        }

        binding.bottomNavigation.clSearch.setOnClickListener {
            if(savedInstanceState==null){
                var fragment = SearchFragment.newInstance()
                val fragmentManager: FragmentManager = supportFragmentManager
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.fragmentContainer, fragment)
                fragmentTransaction.commit()
            }
        }

        binding.bottomNavigation.clInspire.setOnClickListener {
            if(savedInstanceState==null){
                var fragment = InspireFragment.newInstance()
                val fragmentManager: FragmentManager = supportFragmentManager
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.fragmentContainer, fragment)
                fragmentTransaction.commit()
            }
        }

    }

}
