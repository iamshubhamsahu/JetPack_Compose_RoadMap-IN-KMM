package com.example.jetpackcomposeroadmap.android.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpackcomposeroadmap.android.lazy_item_animations.LazyItemAnimations

fun NavGraphBuilder.LazyItemAnimationNav(navController: NavController) {
    navigation(startDestination = "main_screen", route = "LetterD"){
        composable(route = "lazy_item_animations_screen"){
         LazyItemAnimations(navController = navController)
        }
    }
}