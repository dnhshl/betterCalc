package com.example.simplecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import simplecalc.R
import simplecalc.databinding.ActivityMainBinding
import splitties.toast.toast


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val num1 = binding.editTextInput.text.toString()
            val num2 = binding.editTextInput2.text.toString()

            if(num1.isEmpty() || num2.isEmpty()){
                toast(getString(R.string.noInput))
            } else {
                binding.textViewOutput.text = (num1.toInt() + num2.toInt()).toString()
            }
        }
    }
}