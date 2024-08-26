package com.example.hotelloginsystem.screen

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.hotelloginsystem.nav.Screens

@Composable

fun ProfileScreen(navController: NavController){


    Button(onClick = { navController.navigate(Screens.MainScreen.route) }) {

    }



}