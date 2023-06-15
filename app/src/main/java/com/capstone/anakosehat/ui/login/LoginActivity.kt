package com.capstone.anakosehat.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.anakosehat.databinding.ActivityLoginBinding
import com.capstone.anakosehat.ui.register.RegisterActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        toRegister()
    }

    private fun toRegister() {
        binding.tvRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity :: class.java))
            finish()
        }
    }
}