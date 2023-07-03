package com.example.youtube.ui.fragments

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.homework1_android4.base.BaseFragment
import com.example.youtube.R
import com.example.youtube.databinding.FragmentYouTubeBinding
import com.example.youtube.ui.adapters.CategoryAdapter
import com.example.youtube.ui.adapters.CategoryAdapterHorizontal
import com.example.youtube.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class YouTubeFragment :
    BaseFragment<FragmentYouTubeBinding, YouTubeViewModel>(R.layout.fragment_you_tube) {

    override val binding by viewBinding(FragmentYouTubeBinding::bind)
    override val viewModel by viewModels<YouTubeViewModel>()
    private val categoryAdapter = CategoryAdapter()
    private val categoryAdapterHorizontal = CategoryAdapterHorizontal(this::onItemClick)

    private fun onItemClick(id : String) {
        Log.e("daniel", "sfgfdg")
        viewModel.fetchVideoCategoryId(id).observe(viewLifecycleOwner){
            when (it) {
                is Resource.Error -> {
                    Log.e("animeDane", it.message.toString())
                }

                is Resource.Loading -> {
                    Log.e("animeDani", it.message.toString())
                }

                is Resource.Success -> {
                    categoryAdapter.submitList(it.data?.items)
                    Log.d("animeDan", it.data?.items.toString())
                }
            }
        }
    }

    override fun initialize() {
        binding.recyclerviewYouTube.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = categoryAdapter
        }

        binding.recyclerviewYouTubeHorizontal.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = categoryAdapterHorizontal
        }
    }

    override fun setupSubscribes() {
        viewModel.fetchVideos().observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Error -> {
                    Log.e("anime", it.message.toString())

                }
                is Resource.Loading -> {

                }
                is Resource.Success -> {
                    categoryAdapter.submitList(it.data?.items)
                    Log.d("anime", it.data?.items.toString())
                }
            }
        }

        viewModel.fetchVideoCategory().observe(viewLifecycleOwner){
            when (it) {
                is Resource.Error -> {
                    Log.e("anime", it.message.toString())

                }
                is Resource.Loading -> {

                }
                is Resource.Success -> {
                    categoryAdapterHorizontal.submitList(it.data?.items)
                    Log.d("anime", it.data?.items.toString())
                }
            }
        }
    }
}