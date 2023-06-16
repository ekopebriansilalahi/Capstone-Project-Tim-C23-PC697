package com.capstone.anakosehat.data.remote

import com.capstone.anakosehat.data.model.PostSignUpRequest
import com.capstone.anakosehat.data.model.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AnaKoSehatService {
    @POST("/auth/signup")
    suspend fun postSignUp(
        @Body request: PostSignUpRequest
    ): Response

}