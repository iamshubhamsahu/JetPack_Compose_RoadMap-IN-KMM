package com.example.jetpackcomposeroadmap.android.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpackcomposeroadmap.android.picker.ContactPicker
import com.example.jetpackcomposeroadmap.android.picker.PhotoAndMediaPicker
import com.example.jetpackcomposeroadmap.android.picker.TimeAndDatePicker

fun NavGraphBuilder.PickerNav(navController: NavController) {

    navigation(startDestination = "main_screen", route = "LetterA") {

        composable(route = "contact_screen") {
            ContactPicker(navController = navController)
        }
        composable(route = "photoandmedia_screen") {
            PhotoAndMediaPicker(navController = navController)
        }
        composable(route = "timeanddate_screen") {
            TimeAndDatePicker(navController = navController)
        }

    }
}