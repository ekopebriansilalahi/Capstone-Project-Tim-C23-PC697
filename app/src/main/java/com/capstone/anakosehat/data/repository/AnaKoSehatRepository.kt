package com.capstone.anakosehat.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.capstone.anakosehat.data.model.PostSignInRequest
import com.capstone.anakosehat.data.model.PostSignUpRequest
import com.capstone.anakosehat.data.model.Response
import com.capstone.anakosehat.data.remote.AnaKoSehatService
import com.capstone.anakosehat.utils.Result

class AnaKoSehatRepository(private val apiService: AnaKoSehatService) {
    fun postSignUp(request: PostSignUpRequest): LiveData<Result<Response>>  = liveData {

        emit(Result.Loading)
        try {
            val response = apiService.postSignUp(request)
            emit(Result.Success(response))

        } catch (e: Exception) {
            Log.d("REGISTER", e.message.toString())
            emit(Result.Error(e.message.toString()))
        }
    }
    fun postSignIn(request: PostSignInRequest): LiveData<Result<Response>>  = liveData {

        emit(Result.Loading)
        try {
            val response = apiService.postSignIn(request)
            emit(Result.Success(response))

        } catch (e: Exception) {
            Log.d("LOGIN", e.message.toString())
            emit(Result.Error(e.message.toString()))
        }
    }
}