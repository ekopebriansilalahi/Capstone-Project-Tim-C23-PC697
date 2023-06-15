package com.capstone.anakosehat.ui.physattr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.anakosehat.databinding.ActivityPhysicalAttributeBinding

class PhysicalAttribute : AppCompatActivity() {
    private lateinit var binding : ActivityPhysicalAttributeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPhysicalAttributeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}