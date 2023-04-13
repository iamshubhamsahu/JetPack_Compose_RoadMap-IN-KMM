package com.example.jetpackcomposeroadmap.android.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpackcomposeroadmap.android.searchbar.SearchBar
import com.example.jetpackcomposeroadmap.android.toolstips.TapTargetViewToolTips

fun NavGraphBuilder.ToolstipsNav(navController: NavController) {

    navigation(startDestination = "main_screen", route = "LetterC") {

        composable(route = "taptargetviewtooltips_screen") {
            TapTargetViewToolTips(navController = navController)
        }
    }
}