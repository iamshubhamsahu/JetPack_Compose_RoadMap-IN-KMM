package com.example.jetpackcomposeroadmap.android.picker

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun PhotoAndMediaPicker(navController: NavController) {
//    var context = LocalContext.current
//    val photoUri: Uri? by remember { mutableStateOf(null) }
//    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->
//           photoUri = uri
//        }
//
//    Column {
//        Button(onClick = { launcher.launch(PickVisualMediaRequest(mediaType = ActivityResultContracts.PickVisualMedia.ImageOnly)) }) {
//            Text("Select Picture")
//        }
//        if (photoUri != null){
//            val painter = rememberAsyncImagePainter(ImageRequest.Builder(context).data(data = photoUri).build())
//
//            Image(painter = painter, contentDescription = null,
//            modifier = Modifier.padding(5.dp).fillMaxWidth().border(6.dp, Color.Gray), contentScale = ContentScale.Crop)
//        }
//    }

}