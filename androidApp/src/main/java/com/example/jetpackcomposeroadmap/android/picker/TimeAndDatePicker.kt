package com.example.jetpackcomposeroadmap.android.picker

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import java.time.Year
import java.util.*

@Composable
fun TimeAndDatePicker(navController: NavController) {
    val context = LocalContext.current
    val calender = Calendar.getInstance()
    val hour = calender[Calendar.HOUR_OF_DAY]
    val minute = calender[Calendar.MINUTE]
    val time = remember { mutableStateOf("") }

    val year = calender[Calendar.YEAR]
    val month = calender[Calendar.MONTH]
    val day = calender[Calendar.DAY_OF_MONTH]
    calender.time = Date()
    val date = remember { mutableStateOf("") }

    val datePickerDialog = DatePickerDialog(
        context,{_:DatePicker,year: Int,month : Int , DayOfMonth: Int ->
            date.value = "$DayOfMonth/${month+1}/$year"
        },year,month,day
    )


    val timePickDialog = TimePickerDialog(
        context, { _, hour: Int, minute: Int ->
            time.value = "$hour:$minute"
        }, hour, minute, false
    )
    Column(
        modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {
            timePickDialog.show()
        }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58))) {
            Text(text = "Open Time Picker", color = Color.White)
        }
        Spacer(modifier = Modifier.size(100.dp))
        Text(text = "Selected Time: ${time.value}")
        Spacer(modifier = Modifier.size(100.dp))
        Button(onClick = {
             datePickerDialog.show()
        }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58))) {
            Text(text = "Open Date Picker", color = Color.White)
        }
        Spacer(modifier = Modifier.size(100.dp))

        Text(text = "Selected Date: ${date.value}")
    }

}