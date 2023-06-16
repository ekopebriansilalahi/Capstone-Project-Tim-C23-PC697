package com.capstone.anakosehat.ui.login

import androidx.lifecycle.ViewModel
import com.capstone.anakosehat.data.model.PostSignInRequest
import com.capstone.anakosehat.data.repository.AnaKoSehatRepository

class LoginViewModel(private val repo: AnaKoSehatRepository):ViewModel() {

    fun postLogin(request: PostSignInRequest) = repo.postSignIn(request)
}