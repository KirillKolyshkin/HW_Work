package com.example.websocketapp

import com.example.websocketapp.models.Device
import com.example.websocketapp.models.LoginResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {
    @POST("login")
    fun login(@Body device: Device): Single<LoginResponse>
}
