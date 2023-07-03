package com.example.youtube.data.remote.apiservices

import com.example.youtube.data.models.VideoCategory
import com.example.youtube.data.models.YoutubeResponce
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface VideoCategoryApiService {

    @GET("videos")
    suspend fun fetchVideoCategoryId(
        @Query("categoryId") id: String,
        @Query("part") part: String = "snippet",
        @Query("regionCode") regionCode: String = "ru",
        @Query("chart") chart: String = "mostPopular",
    ): Response<YoutubeResponce<VideoCategory>>

    @GET("videoCategories")
    suspend fun fetchVideoCategory(
        @Query("part") part: String = "snippet",
        @Query("regionCode") regionCode: String = "ru",
        @Query("chart") chart: String = "mostPopular",
    ): Response<YoutubeResponce<VideoCategory>>

    @GET("videos")
    suspend fun fetchVideos(
        @Query("part") part: String = "snippet",
        @Query("regionCode") regionCode: String = "ru",
        @Query("chart") chart: String = "mostPopular",
    ): Response<YoutubeResponce<VideoCategory>>
}