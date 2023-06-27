package com.example.youtube.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.youtube.data.model.category.VideoCategory
import com.example.youtube.databinding.ItemYouTubeBinding

class CategoryAdapter() :
    ListAdapter<VideoCategory, CategoryAdapter.AnimeViewHolder>(DiffUtilCallback()) {

    inner class AnimeViewHolder(private val binding: ItemYouTubeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: VideoCategory) = with(binding) {
            Glide.with(binding.imageView.context)
                .load(item.snippet.thumbnails.high.url)
                .into(binding.imageView)
            Glide.with(binding.imageView2.context)
                .load(item.snippet.thumbnails.high.url)
                .into(binding.imageView2)
            binding.name.text = item.snippet.localized.description
            binding.pushingAt.text = item.snippet.localized.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemYouTubeBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    companion object {

        class DiffUtilCallback : DiffUtil.ItemCallback<VideoCategory>() {

            override fun areItemsTheSame(oldItem: VideoCategory, newItem: VideoCategory): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: VideoCategory, newItem: VideoCategory): Boolean {
                return oldItem == newItem
            }
        }
    }
}

