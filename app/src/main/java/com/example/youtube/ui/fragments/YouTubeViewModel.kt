package com.example.youtube.ui.fragments

import androidx.lifecycle.ViewModel
import com.example.youtube.data.repositories.VideoCategoryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class YouTubeViewModel @Inject constructor(
    private val repository: VideoCategoryRepository
): ViewModel() {

    fun fetchVideoCategoryId(id: String) = repository.fetchVideoCategoryId(id)

    fun fetchVideos() = repository.fetchVideos()

    fun fetchVideoCategory() = repository.fetchVideoCategory()

}