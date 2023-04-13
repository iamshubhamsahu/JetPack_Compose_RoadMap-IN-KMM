package com.example.jetpackcomposeroadmap.android.toolstips

import android.R
import android.annotation.SuppressLint
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetView


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TapTargetViewToolTips() {
    val context = LocalContext.current

    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    Scaffold(
        scaffoldState = scaffoldState,
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatingActionButton(onClick = {
//
//                TapTargetView.showFor(
//                    TapTarget.forView("This is Target", "We have the best targets,believe me!")
//                        .outerCircleColor(R.color.black)
//                        .outerCircleAlpha(0.96f)
//                        .targetCircleColor(R.color.white)
//                        .titleTextSize(20)
//                        .titleTextColor(R.color.white)
//                        .descriptionTextSize(10)
//                        .descriptionTextColor(R.color.holo_blue_bright)
//                        .textColor(R.color.holo_blue_bright)
//                        .textTypeface(Typeface.SANS_SERIF)
//                        .dimColor(R.color.black)
//                        .drawShadow(true)
//                        .cancelable(false)
//                        .tintTarget(true)
//                        .transparentTarget(false)
//                        .targetRadius(60), object : TapTargetView.Listener() {
//                        override fun onTargetClick(view: TapTargetView) {
//                            super.onTargetClick(view)
//                            Toast.makeText(context, "Shubham Sahu", Toast.LENGTH_SHORT).show()
//                        }
//                    }
//                )


            }) {
                Text("X")
            }
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top
            ) {
                Text(text = "Tooltips", fontWeight = FontWeight.Bold, color = Color.Red)
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {

                }) {
                    Text(text = "Step 1")
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {

                }) {
                    Text(text = "Step 2")
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {

                }) {
                    Text(text = "Step 3")
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {

                }) {
                    Text(text = "Step 4")
                }


            }
        }
    )
}