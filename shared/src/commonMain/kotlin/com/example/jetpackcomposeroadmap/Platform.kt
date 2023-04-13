package com.example.jetpackcomposeroadmap

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform