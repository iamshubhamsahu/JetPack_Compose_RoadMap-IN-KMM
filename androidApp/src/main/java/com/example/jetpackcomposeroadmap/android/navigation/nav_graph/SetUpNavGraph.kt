package com.example.jetpackcomposeroadmap.android.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeroadmap.android.MainScreen
import com.example.jetpackcomposeroadmap.android.picker.ContactPicker
import com.example.jetpackcomposeroadmap.android.picker.PhotoAndMediaPicker
import com.example.jetpackcomposeroadmap.android.picker.TimeAndDatePicker

@Composable
fun SetUpNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main_screen") {
        composable(route = "main_screen"){
            MainScreen(navController = navController)
        }
        composable(route = "contact_picker") {
            ContactPicker(navController = navController)
        }
        composable(route = "photoandmedia_picker"){
            PhotoAndMediaPicker(navController = navController)
        }
        composable(route = "timeanddate_picker"){
            TimeAndDatePicker(navController = navController)
        }
    }
}