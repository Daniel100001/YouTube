package com.example.youtube.data.model

data class ContentDetails(
    val duration: String = "",
    val licensedContent: Boolean = false,
    val caption: String = "",
    val definition: String = "",
    val regionRestriction: RegionRestriction,
    val projection: String = "",
    val dimension: String = ""
)