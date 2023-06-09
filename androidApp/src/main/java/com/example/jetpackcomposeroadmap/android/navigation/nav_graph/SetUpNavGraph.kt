package com.example.jetpackcomposeroadmap.android.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeroadmap.android.MainScreen
import com.example.jetpackcomposeroadmap.android.navigation.LazyItemAnimationNav
import com.example.jetpackcomposeroadmap.android.navigation.PickerNav
import com.example.jetpackcomposeroadmap.android.navigation.SearchBarNav
import com.example.jetpackcomposeroadmap.android.navigation.ToolstipsNav
import com.example.jetpackcomposeroadmap.android.navigation.UINav

@Composable
fun SetUpNavGraph() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main_screen") {

        composable(route = "main_screen") {
            MainScreen(navController = navController)
        }

        PickerNav(navController)
        SearchBarNav(navController)
        ToolstipsNav(navController)
        LazyItemAnimationNav(navController)
        UINav(navController)

    }
}