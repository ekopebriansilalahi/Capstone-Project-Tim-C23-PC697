package com.capstone.anakosehat.ui.login

import ViewModelFactory
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.capstone.anakosehat.MainActivity
import com.capstone.anakosehat.data.model.PostSignInRequest
import com.capstone.anakosehat.databinding.ActivityLoginBinding
import com.capstone.anakosehat.ui.register.RegisterActivity
import com.capstone.anakosehat.utils.Result

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var factory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        factory = ViewModelFactory.getInstance(this)
        loginViewModel = ViewModelProvider(this, factory)[LoginViewModel::class.java]

        toRegister()
        btnLogin()
        showLoading()
//        isLogin()
    }

    private fun toRegister() {
        binding.tvRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }
    }

//    private fun isLogin() {
//        if(userPreferences.getPref().isLogin == true) {
//            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
//            finish()
//        }
//    }

    private fun showLoading() {
    }

    private fun btnLogin() {
        binding.button.setOnClickListener {
            val edtEmail = binding.edtEmail.text.toString()
            val edtPassword = binding.edtPass.text.toString()

            val request = PostSignInRequest(
                edtEmail,
                edtPassword
            )
            postLogin(request)
        }
    }

        fun showText(message: String) {
            Toast.makeText(this@LoginActivity, message, Toast.LENGTH_SHORT).show()
        }

        fun postLogin(request: PostSignInRequest) {
            loginViewModel.postLogin(request).observe(this) {
                when (it) {
                    is Result.Success -> {
                        showText(it.data.message)
                        if(it.data.message == "Sign in successful"){
                            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                        }

                    }
                    is Result.Error->{
                        showText(it.error)
                    }
                    is Result.Loading ->{
                        showLoading()
                    }

                }
            }
        }
    }