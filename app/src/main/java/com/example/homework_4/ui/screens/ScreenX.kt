package com.example.homework_4.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
@Composable
fun ScreenX(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        Text("Screen X")
        Button(onClick ={navController.navigate(Routes.SCREEN_Y){
            popUpTo(Routes.SCREEN_X) { inclusive = true }
        }} ) {
            Text("Go to Screen Y")
        }
    }


}