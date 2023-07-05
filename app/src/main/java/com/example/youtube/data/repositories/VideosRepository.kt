package com.example.youtube.data.repositories

import com.example.youtube.base.BaseRepository
import com.example.youtube.data.remote.apiservices.VideosApiService
import javax.inject.Inject

class VideosRepository @Inject constructor(
    private val service: VideosApiService
) : BaseRepository(){

    fun fetchVideos(id: String?) = doRequest {
        service.fetchVideos(categoryId = id)
    }
}