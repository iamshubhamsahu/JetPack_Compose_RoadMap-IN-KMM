package com.example.jetpackcomposeroadmap.android.picker

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnrememberedMutableState")
@Composable
fun ContactPicker(navController: NavController) {

//    val contactName by mutableStateOf("")
//    val contactNumber by mutableStateOf("")
//    val context = LocalContext.current
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(30.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(text = "Contact in Android", fontWeight = FontWeight.Bold, color = Color.Red)
//        Spacer(modifier =Modifier.height(20.dp))
//        Text(text = contactName, fontWeight = FontWeight.Bold, color = Color.Blue)
//        Spacer(modifier =Modifier.height(20.dp))
//        Text(text = contactNumber, fontWeight = FontWeight.Bold, color = Color.Blue)
//        Button(onClick = {
//
//
//
//        }) {
//            Text(text = "Pick Contact")
//        }
//
//
//    }
}