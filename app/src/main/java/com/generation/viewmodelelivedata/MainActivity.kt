package com.generation.viewmodelelivedata

import android.arch.lifecycle.ViewModelProvider
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.generation.viewmodelelivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this)
            .get(MainViewModel::class.java)

        mainViewModel.cont.observe(this){
            binding.textContador.text = it.toString()

        }

        binding.buttonClique.setOnClickListener {
            mainViewModel.addNum()
            binding.textContador.text = mainViewModel.cont.toString()

        }
    }
}