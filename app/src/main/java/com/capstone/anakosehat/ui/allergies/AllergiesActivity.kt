package com.capstone.anakosehat.ui.allergies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.anakosehat.databinding.ActivityAllergiesBinding

class AllergiesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAllergiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllergiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}