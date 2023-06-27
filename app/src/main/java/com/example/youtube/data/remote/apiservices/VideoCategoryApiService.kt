package com.example.youtube.data.remote.apiservices

import com.example.youtube.data.model.YouTubeResponse
import com.example.youtube.data.model.category.VideoCategory
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface VideoCategoryApiService {

    @GET("videos")
    suspend fun fetchVideoCategory(
        @Query("part") part: String = "snippet",
        @Query("regionCode") regionCode: String = "ru",
        @Query("chart") chart: String = "mostPopular",
    ): Response<YouTubeResponse<VideoCategory>>


}