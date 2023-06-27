package com.example.youtube.data.model

data class Snippet(
    val defaultLanguage: String = "",
    val publishedAt: String = "",
    val defaultAudioLanguage: String = "",
    val localized: Localized,
    val description: String = "",
    val title: String = "",
    val thumbnails: Thumbnails,
    val channelId: String = "",
    val categoryId: String = "",
    val channelTitle: String = "",
    val tags: List<String>?,
    val liveBroadcastContent: String = ""
)