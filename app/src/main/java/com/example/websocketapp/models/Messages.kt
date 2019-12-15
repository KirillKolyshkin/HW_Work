package com.example.websocketapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Message(
    val id: Long,
    val message: String = "",
    val user: String = ""
)

class GetMessagesResponse {

    @SerializedName("items")
    @Expose
    var items: List<Message>? = null
    @SerializedName("first")
    @Expose
    var first: Int? = null

}
