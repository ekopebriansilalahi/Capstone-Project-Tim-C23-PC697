package com.capstone.anakosehat.ui.register

import ViewModelFactory
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.capstone.anakosehat.utils.Result
import androidx.lifecycle.ViewModelProvider
import com.capstone.anakosehat.data.model.PostSignUpRequest
import com.capstone.anakosehat.databinding.ActivityRegisterBinding
import com.capstone.anakosehat.ui.login.LoginActivity

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var registerViewModel: RegisterViewModel
    private lateinit var factory: ViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        factory = ViewModelFactory.getInstance(this)
        registerViewModel = ViewModelProvider(this, factory)[RegisterViewModel::class.java]

        binding.button.setOnClickListener {
            getData()
        }
        binding.tvLogin.setOnClickListener {
            toLogin()
        }
    }

    private fun getData() {
        var isTrue = true
        binding.apply {
            if(edtName.text!!.isEmpty()) {
                edtName.error = "Isi dulu"
                isTrue = false
            }
            if(edtEmail.text!!.isEmpty()) {
                edtEmail.error = "Isi dulu"
                isTrue = false
            }

            if(edtPass.text!!.isEmpty()) {
                edtPass.error = "Isi"
                isTrue = false
            }
        }
        if (isTrue) {
            val request = PostSignUpRequest(
                binding.edtName.text.toString(),
                binding.edtEmail.text.toString(),
                binding.edtPass.text.toString()
            )
            postRegister(request)
        }
    }

    private fun postRegister(request: PostSignUpRequest) {
        registerViewModel.postRegister(request).observe(this) {
            when(it) {
                is Result.Success -> {
                    showText(it.data.message)
                    toLogin()
                }
                is Result.Loading -> {
                }
                is Result.Error -> {
                }
            }
        }
    }

    private fun showText(message: String) {
        Toast.makeText(this@RegisterActivity, message, Toast.LENGTH_SHORT).show()
    }

    private fun toLogin() {
        startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
        finish()
    }
}