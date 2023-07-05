package com.example.youtube.data.remote.apiservices

import com.example.youtube.data.models.videocategory.VideoCategory
import com.example.youtube.data.models.YoutubeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface VideosApiService {

    @GET("videos")
    suspend fun fetchVideos(
        @Query("part") part: String = "snippet",
        @Query("regionCode") regionCode: String = "ru",
        @Query("chart") chart: String = "mostPopular",
        @Query("videoCategoryId") categoryId: String? = null
    ): Response<YoutubeResponse<VideoCategory>>
}