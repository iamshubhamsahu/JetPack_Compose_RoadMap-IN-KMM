package com.example.jetpackcomposeroadmap.android.searchbar

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.DrawerValue
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import com.example.jetpackcomposeroadmap.android.R
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState

@SuppressLint("UnrememberedMutableState", "UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SearchBar(navController: NavController) {

    val context = LocalContext.current
    val india = LatLng(20.5937, 78.9629)
    val cameraPosition = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(india, 10f)
    }


    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    Scaffold(scaffoldState = scaffoldState,

        topBar = {
            TopAppBar(backgroundColor = Color.Green, title = {
                Text(
                    text = "Shubham Sahu",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = Color.White
                )

            })
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
                modifier = Modifier.fillMaxSize(), cameraPositionState = cameraPosition
            ) {

                MarkerOptions().position(india).title("Marker in India").icon(bitmapFromVector(context, coil.base.R.drawable.ic_100tb))

            }
        }
    )
}

private fun bitmapFromVector(context: Context, vectorResId : Int): BitmapDescriptor{
    val vectorDrawable = ContextCompat.getDrawable(context,vectorResId)!!
    vectorDrawable.setBounds(0,0,vectorDrawable.intrinsicWidth,vectorDrawable.intrinsicHeight)
    val bitmap = Bitmap.createBitmap(vectorDrawable.intrinsicWidth,vectorDrawable.intrinsicHeight,Bitmap.Config.ARGB_8888)
//    val canvas = Canvas(bitmap)
//    vectorDrawable.draw(canvas)
    return BitmapDescriptorFactory.fromBitmap(bitmap)
}