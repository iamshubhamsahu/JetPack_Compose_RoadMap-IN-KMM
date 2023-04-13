package com.example.jetpackcomposeroadmap.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeroadmap.android.navigation.nav_graph.SetUpNavGraph
import com.example.jetpackcomposeroadmap.android.picker.ContactPicker
import com.example.jetpackcomposeroadmap.android.picker.TimeAndDatePicker
import com.example.jetpackcomposeroadmap.android.searchbar.SearchBar
import com.example.jetpackcomposeroadmap.android.toolstips.TapTargetViewToolTips

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {

                SetUpNavGraph()

            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
