package br.com.movieapp.core.presentation.navigation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold (
        bottomBar = {
            BottomNavigationBar(navControler = navController)
        },
        content = {
            NavigationGraph(navController = navController)
        }

    )

}