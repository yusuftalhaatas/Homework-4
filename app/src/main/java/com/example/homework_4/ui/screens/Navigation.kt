package com.example.homework_4.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


object Routes {
    const val MAIN_SCREEN = "main_screen"
    const val SCREEN_A = "screen_a"
    const val SCREEN_B = "screen_b"
    const val SCREEN_X = "screen_x"
    const val SCREEN_Y= "screen_y"
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.MAIN_SCREEN) {
        composable(Routes.MAIN_SCREEN) {
            MainScreen(navController = navController)
        }
        composable(Routes.SCREEN_A) {
            ScreenA(navController = navController)
        }
        composable(Routes.SCREEN_B) {
            ScreenB(navController = navController)
        }
        composable(Routes.SCREEN_X) {
            ScreenX(navController = navController)
        }
        composable(Routes.SCREEN_Y) {
            ScreenY(navController = navController)
        }
    }
}
