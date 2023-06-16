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

data class PhysicalAttribute(
    var isLogin: Boolean ?= null,
    var age: Int ?= null,
    var weight: Float ?= null,
    var height: Float ?= null,
    var sex: Boolean ?= null,
)

data class Allergies(
    var allergies: MutableList<String> ?= null
)
