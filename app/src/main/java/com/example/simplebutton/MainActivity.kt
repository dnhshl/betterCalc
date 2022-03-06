package com.example.simplebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.simplebutton.databinding.ActivityMainBinding
import splitties.toast.longToast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val TAG = "MainActivity"
    private var clickcounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            clickcounter++
            Log.i(TAG, "SimpleButton wurde $clickcounter mal gedrückt")
            longToast("SimpleButton wurde $clickcounter mal gedrückt")
            binding.button.text = getString(R.string.simpleButtonTxt2)
        }
    }
}