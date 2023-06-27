package com.example.youtube.data.model

data class ItemsItem(
    val snippet: Snippet,
    val kind: String = "",
    val etag: String = "",
    val id: String = "",
    val contentDetails: ContentDetails,
    val statistics: Statistics
)