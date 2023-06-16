package com.capstone.anakosehat.data.model


data class PostSignUpRequest(
    val name: String,
    val email: String,
    val password: String
)

data class PostSignInRequest(
    val email: String,
    val password: String
)

data class Response(
    val message: String,
)
