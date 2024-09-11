package br.com.movieapp.core.presentation.navigation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

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

@Preview
@Composable
fun mainScreenPreview() {
    MainScreen(navController = rememberNavController())
}