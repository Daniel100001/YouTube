package com.example.youtube.data.model.category

import com.example.youtube.data.model.Localized
import com.example.youtube.data.model.ThumbnailsYt
import com.google.gson.annotations.SerializedName

data class VideoCategory(

    @SerializedName("kind")
    val kind: String,

    @SerializedName("etag")
    val etag : String,

    @SerializedName("id")
    val id : Int,

    @SerializedName("snippet")
    val snippet: Snippet
)

data class Snippet(

    @SerializedName("publishedAt")
    val publishedAt : String,

    @SerializedName("channelId")
    val channelId: String,

    @SerializedName("localized")
    val localized: Localized,

    @SerializedName("thumbnails")
    val thumbnails: ThumbnailsYt
)