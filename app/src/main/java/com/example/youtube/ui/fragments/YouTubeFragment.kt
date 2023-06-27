package com.example.youtube.ui.fragments

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.homework1_android4.base.BaseFragment
import com.example.homework1_android4.utils.Resource
import com.example.youtube.R
import com.example.youtube.databinding.FragmentYouTubeBinding
import com.example.youtube.ui.adapters.CategoryAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class YouTubeFragment :
    BaseFragment<FragmentYouTubeBinding, YouTubeViewModel>(R.layout.fragment_you_tube) {
    override val binding by viewBinding(FragmentYouTubeBinding::bind)
    override val viewModel by viewModels<YouTubeViewModel>()
    private val categoryAdapter = CategoryAdapter()

    override fun initialize() {
        super.initialize()
        binding.recyclerviewYouTube.adapter = categoryAdapter

    }
    override fun setupSubscribes() {
        viewModel.fetchVideoCategory().observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Error -> {
                    Log.e("anime", it.message.toString())
                }
                is Resource.Loading -> {

                }
                is Resource.Success -> {
                    categoryAdapter.submitList(it.data!!.items)
                    Log.d("anime", it.data?.items.toString())
                }
            }
        }
    }
}