package com.example.simplecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import simplecalc.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val numberstring = binding.editTextInput.text.toString()
            binding.textViewOutput.text = numberstring
        }
    }
}