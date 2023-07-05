package com.example.youtube.ui.fragments.youtube

import androidx.lifecycle.ViewModel
import com.example.youtube.data.repositories.VideoCategoryRepository
import com.example.youtube.data.repositories.VideosRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class YouTubeViewModel @Inject constructor(
    private val videoCategoryRepository: VideoCategoryRepository,
    private val videosRepository: VideosRepository
): ViewModel() {


    fun fetchVideos(id: String?) = videosRepository.fetchVideos(id)

    fun fetchVideoCategory() = videoCategoryRepository.fetchVideoCategory()

}