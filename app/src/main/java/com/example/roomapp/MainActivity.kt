package com.example.roomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import com.example.roomapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.lifecycleOwner = this

        val navHostFragment =
            supportFragmentManager.fingFragmentById(androidx.fragment.R.id.fragment_container_view_tag) as NavHostFragment
        navController = navHostFragment.navController
    }
}