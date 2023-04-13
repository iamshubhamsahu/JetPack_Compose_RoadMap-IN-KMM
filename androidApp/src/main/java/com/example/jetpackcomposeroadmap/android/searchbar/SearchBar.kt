package com.example.jetpackcomposeroadmap.android.searchbar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState

@SuppressLint("UnrememberedMutableState", "UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SearchBar(navController: NavController) {

    val context = LocalContext.current
    val india = LatLng(20.5937,78.9629)
    val cameraPosition = rememberCameraPositionState{
        position = CameraPosition.fromLatLngZoom(india,10f)
    }


    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    Scaffold(
        scaffoldState = scaffoldState,

        topBar = {
            TopAppBar(backgroundColor = Color.Green,
                title = {
                    Text(
                        text = "Shubham Sahu",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )

                }
            )
        },

        content = {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(30.dp),
//                horizontalAlignment = Alignment.Start,
//                verticalArrangement = Arrangement.Top
//            ) {}
            GoogleMap(
                modifier = Modifier.fillMaxSize(),
                cameraPositionState = cameraPosition
            ){


            }

        }
    )

}