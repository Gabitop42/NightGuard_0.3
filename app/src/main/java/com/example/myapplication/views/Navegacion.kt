
package com.example.myapplication.views


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "firstScreen",
        modifier = modifier
    ) {
        composable("firstScreen") { FirstScreen(navController) }
        composable("secondScreen") { SecondScreen(navController) }
    }
}
// Esta funcion @Composable define la navegación de la aplicacion, utilizando NavHost para gestionar dos pantallas "firstScreen" y "secondScreen"
// que se navegan mediante un NavHostController . El destino inicial es "firstScreen" y cada pantalla esta asociada a un composable FirstScreen y SecondScreen.

