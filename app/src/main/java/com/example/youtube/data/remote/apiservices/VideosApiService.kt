package com.example.youtube.data.remote.apiservices

import retrofit2.http.GET
import retrofit2.http.Query

interface VideosApiService {

    @GET("videos")
    suspend fun fetchVideos(
        @Query("part") part: String = "snippet",
        @Query("id") id: Int
    )

    @GET("channels")
    suspend fun fetchChannel(
        @Query("part") part: String
    )
}