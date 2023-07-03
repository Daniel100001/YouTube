package com.example.youtube.data.repositories

import com.example.youtube.base.BaseRepository
import com.example.youtube.data.remote.apiservices.VideoCategoryApiService
import javax.inject.Inject

class VideoCategoryRepository @Inject constructor(
    private val service: VideoCategoryApiService
) : BaseRepository(){

    fun fetchVideoCategoryId(id : String) = doRequest {
        service.fetchVideoCategoryId(id)
    }

    fun fetchVideos() = doRequest {
        service.fetchVideos()
    }

    fun fetchVideoCategory() = doRequest {
        service.fetchVideoCategory()
    }
}