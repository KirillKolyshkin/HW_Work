package com.example.websocketapp.models

import com.google.gson.annotations.SerializedName

data class Device(
    val username: String,
    @SerializedName("device_id")
    val deviceId: String
)
