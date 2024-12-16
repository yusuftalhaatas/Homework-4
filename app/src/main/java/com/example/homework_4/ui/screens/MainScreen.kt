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
fun MainScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        Text("Main Screen")
        Button (onClick = { navController.navigate(Routes.SCREEN_A) }) {
            Text("Go to Screen A")
        }
        Button (onClick = { navController.navigate(Routes.SCREEN_X) }) {
            Text("Go to Screen X")
        }
    }

}