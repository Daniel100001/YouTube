package com.example.youtube.data.models

import com.google.gson.annotations.SerializedName

data class MangaResponse<T>(
    @SerializedName("data")
    val data: List<T>
)