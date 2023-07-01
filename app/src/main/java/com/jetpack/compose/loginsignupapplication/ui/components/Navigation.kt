package com.jetpack.compose.loginsignupapplication.ui.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jetpack.compose.loginsignupapplication.ui.screens.LoginScreen
import com.jetpack.compose.loginsignupapplication.ui.screens.SignupScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.LoginRoute.route) {
        composable(Routes.LoginRoute.route) {
            LoginScreen(navController)
        }
        composable(Routes.SignupRoute.route) {
            SignupScreen(navController)
        }
    }
}