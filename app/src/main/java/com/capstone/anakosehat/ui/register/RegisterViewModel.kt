package com.capstone.anakosehat.ui.register

import androidx.lifecycle.ViewModel
import com.capstone.anakosehat.data.model.PostSignUpRequest
import com.capstone.anakosehat.data.repository.AnaKoSehatRepository

class RegisterViewModel(private val repository: AnaKoSehatRepository): ViewModel() {
    fun postRegister(request: PostSignUpRequest) = repository.postSignUp(request)
}