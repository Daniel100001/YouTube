package com.example.youtube.data.remote.apiservices

import com.example.home_4_android_4.data.models.VideoCategory
import com.example.home_4_android_4.data.models.YoutubeResponce
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface VideoCategoryApiService {

    @GET("videos")
    suspend fun fetchVideoCategory(
        @Query("part") part: String = "snippet",
        @Query("regionCode") regionCode: String = "ru",
        @Query("chart") chart: String = "mostPopular",
    ): Response<YoutubeResponce<VideoCategory>>

}