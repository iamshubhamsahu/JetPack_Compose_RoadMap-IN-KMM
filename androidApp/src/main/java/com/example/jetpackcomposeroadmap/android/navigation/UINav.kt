package com.example.jetpackcomposeroadmap.android.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpackcomposeroadmap.android.ui.autofill.Autofill


fun NavGraphBuilder.UINav(navController: NavController) {
    navigation(startDestination = "main_screen", route = "LetterE"){
        composable(route = "autofill_screen"){
            Autofill(navController = navController)
        }
    }
}