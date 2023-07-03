package com.example.youtube.data.models

import com.google.gson.annotations.SerializedName

data class Thumbnails(
    @SerializedName("high")
    val standard: High
)