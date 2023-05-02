package com.example.zomatoclone

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment

class SplashScreenFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_splash_screen, container, false)
        val navController= NavHostFragment.findNavController(this)
        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.action_splashScreenFragment_to_loginScreenFragment)
        },3000L)
        return view
    }


}