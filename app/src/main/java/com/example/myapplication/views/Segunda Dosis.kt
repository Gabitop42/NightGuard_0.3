// SecondScreen.kt
package com.example.myapplication.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SecondScreen(navController: NavHostController) {
    Column {
        Text(text = "Segunda Pantalla")
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Volver a la Primera Pantalla")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    SecondScreen(navController = rememberNavController())
}
// La función SecondScreen define una pantalla que muestra un texto "Segunda Pantalla" y un boton
// Al hacer clic en el boton se navega de vuelta a la primera pantalla utilizando popBackStack() del navController
// La función SecondScreenPreview es una vista previa que muestra la segunda pantalla utilizando un NavHostController
