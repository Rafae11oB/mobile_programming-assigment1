package com.example.instagramclone.services

import com.example.instagramclone.models.Post

interface PostService {
    fun getAll(): List<Post>
}