package com.example.myapplication.components.buttons_AH

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun NavigateButton(navController: NavController, destination: String, buttonText: String) {
    Button(onClick = { navController.navigate(destination) }) {
        Text(text = buttonText)
    }
}
