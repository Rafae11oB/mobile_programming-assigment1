package com.example.instagramclone.services.impl

import com.example.instagramclone.R
import com.example.instagramclone.models.Post
import com.example.instagramclone.services.PostService

class PostServiceImpl: PostService{
    private val posts = listOf(
        Post(R.drawable.img_1, "A beautiful sunset."),
        Post(R.drawable.img_2, "At the beach."),
        Post(R.drawable.img_3, "Amazing view!"),
        Post(R.drawable.img_4, "Nature at its best."),
        Post(R.drawable.img_5, "City lights."),
        Post(R.drawable.img_6, "City lights."),
        Post(R.drawable.img_7, "City lights.")
    )

    override fun getAll(): List<Post> = posts
}