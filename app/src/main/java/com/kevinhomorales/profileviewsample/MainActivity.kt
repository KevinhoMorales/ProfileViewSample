package com.kevinhomorales.profileviewsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kevinhomorales.profileviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpView()
    }

    private fun setUpView() {
        setUpActions()
    }

    private fun setUpActions() {
        binding.buttonId.setOnClickListener {
            binding.cedulaId.setText("1717893901")
            binding.nameId.setText("Kevin")
            binding.lastNameId.setText("Morales")
            binding.emailId.setText("kfmorales94@gmail.com")
            binding.ageId.setText("29 años")
            binding.cityId.setText("Santo Domingo")
            binding.phoneId.setText("+593959084920")
            binding.imageViewId.setImageResource(R.drawable.kevin)
        }
    }
}