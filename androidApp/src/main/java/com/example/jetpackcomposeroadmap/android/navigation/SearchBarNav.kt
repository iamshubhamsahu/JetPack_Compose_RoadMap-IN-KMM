package com.example.jetpackcomposeroadmap.android.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpackcomposeroadmap.android.searchbar.SearchBar

fun NavGraphBuilder.SearchBarNav(navController: NavController) {

    navigation(startDestination = "main_screen", route = "LetterB") {

        composable(route = "searchbar_screen") {
            SearchBar(navController = navController)
        }

    }
}