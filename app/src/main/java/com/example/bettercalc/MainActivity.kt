package com.example.bettercalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import bettercalc.R
import bettercalc.databinding.ActivityMainBinding

import splitties.toast.toast


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val TAG = "MainActivity"
    private var calcModus = 1 // +, 2-, 3x, 4/

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
                when (calcModus) {
                    1 -> binding.textViewOutput.text = (num1.toInt() + num2.toInt()).toString()
                    2 -> binding.textViewOutput.text = (num1.toInt() - num2.toInt()).toString()
                    3 -> binding.textViewOutput.text = (num1.toInt() * num2.toInt()).toString()
                    4 -> binding.textViewOutput.text = (num1.toInt() / num2.toInt()).toString()
                }
            }
        }
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.rb_plus ->
                    if (checked) {
                        calcModus = 1
                        binding.button.text = getString(R.string.plus)
                    }
                R.id.rb_minus ->
                    if (checked) {
                        calcModus = 2
                        binding.button.text = getString(R.string.minus)
                    }
                R.id.rb_mult ->
                    if (checked) {
                        calcModus = 3
                        binding.button.text = getString(R.string.mult)
                    }
                R.id.rb_div ->
                    if (checked) {
                        calcModus = 4
                        binding.button.text = getString(R.string.div)
                    }

            }
        }
    }
}