package com.example.jetpackcomposeroadmap.android.lazy_item_animations

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyItemAnimations(navController: NavController) {

    var names by remember {
        mutableStateOf(
            listOf(
                "Shubham Bhai",
                "Rajesh Bhai",
                "Manoj Bhai",
                "Prince Sir",
                "Jobandeep Sir",
                "Sunil Sir"
            )
        )
    }
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                val random = (names.indices).random()
                names = names.filterIndexed { index, s ->
                    index != random
                }
            }) {
                Text(text = "Remove")
            }

            Button(onClick = {
                val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
                val randomString = (1..10)
                    .map { allowedChars.random() }
                    .joinToString("")
                names = names + randomString

            }) {
                Text(text = "Add")
            }

            Button(onClick = {
                names = names.shuffled()

            }) {
                Text(text = "Shuffle")
            }

        }
        LazyColumn {
            items(
                items = names,
                key = { it }
            ) { name ->
                Text(
                    text = name,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                        .animateItemPlacement()
                )
            }
        }
    }
}

