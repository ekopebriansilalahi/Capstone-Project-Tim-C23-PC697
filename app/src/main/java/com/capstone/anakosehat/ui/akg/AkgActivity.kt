package com.capstone.anakosehat.ui.akg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.anakosehat.databinding.ActivityAkgBinding

class AkgActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAkgBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAkgBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}