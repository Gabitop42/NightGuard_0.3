package com.example.myapplication.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.components.buttons_AH.CustomTextField


@Composable
fun FirstScreen(navController: NavHostController) {

    val fieldStates = remember { mutableStateListOf(TextFieldValue(), TextFieldValue(), TextFieldValue()) }
    val fieldLabels = listOf("Correo", "Contraseña", "Nombre")
    val isPasswordField = listOf(false, true, false)

    Column(modifier = Modifier.padding(16.dp)) {
        fieldLabels.forEachIndexed { index, label ->
            CustomTextField(
                label = label,
                value = fieldStates[index],
                onValueChange = { fieldStates[index] = it },
                isPassword = isPasswordField[index],
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }

        Button(
            onClick = {
                navController.navigate("secondScreen") // Navegar a la segunda pantalla
            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Ir a la Segunda Pantalla")
        }
    }
}
// La funcion FirstScreen define una pantalla con tres campos de texto Correo, Contraseña, Nombre utilizando un CustomTextField para cada uno
// Los valores de los campos son gestionados mediante una lista fieldStates y se pasa una lista de etiquetas y configuración de contraseñas isPasswordField
// Al hacer clic en el boton la pantalla navega hacia la "secondScreen" utilizando el navController
