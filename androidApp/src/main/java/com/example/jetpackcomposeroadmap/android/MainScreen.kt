package com.example.jetpackcomposeroadmap.android

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {

        Text(text = "Pickers", fontWeight = FontWeight.Bold, color = Color.Red)

        Button(onClick = {
            navController.navigate("contact_screen")
        }) {
            Text(text = "Contact Picker")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate("photoandmedia_screen")
        }) {
            Text(text = "Photo and Media Picker")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate("timeanddate_screen")
        }) {
            Text(text = "Time and Date Picker")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "SearchBar", fontWeight = FontWeight.Bold, color = Color.Red)

        Button(onClick = {
            navController.navigate("searchbar_screen")
        }) {
            Text(text = "Search Bar")
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Tooltips", fontWeight = FontWeight.Bold, color = Color.Red)

        Button(onClick = {
            navController.navigate("taptargetviewtooltips_screen")
        }) {
            Text(text = "TapTargetViewToolTips")
        }
        Spacer(modifier = Modifier.height(20.dp))


    }
}