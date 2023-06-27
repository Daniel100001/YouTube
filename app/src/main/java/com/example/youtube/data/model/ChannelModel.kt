package com.example.youtube.data.model

import com.example.youtube.data.model.category.Snippet
import com.google.gson.annotations.SerializedName

data class ChannelModel(
    @SerializedName("items")
    val items: List<Items>
)

data class Items(
    @SerializedName("snippet")
    val snippet: Snippet
)
