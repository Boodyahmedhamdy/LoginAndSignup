package com.jetpack.compose.loginsignupapplication.ui.components

sealed class Routes(val route: String) {
    object LoginRoute: Routes("login")
    object SignupRoute: Routes("signup")
}
