package com.example.dayhanhasap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dayhanhasap.screens.auth.Login
import com.example.dayhanhasap.screens.auth.Register
import com.example.dayhanhasap.screens.cards.Cards
import com.example.dayhanhasap.screens.information.Information
import com.example.dayhanhasap.screens.notification.Notifications
import com.example.dayhanhasap.screens.payment.Payment
import com.example.dayhanhasap.screens.setting.Settings
import com.example.dayhanhasap.ui.theme.DayhanHasapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DayhanHasapTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Route()
                }
            }
        }
    }
}

@Composable
fun Route() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login" ){
        composable("home"){
            Home(navController = navController)
        }
        composable("login"){
            Login(navController = navController)
        }
        composable("register") {
            Register(navController = navController)
        }
        composable("payment"){
            Payment(navController = navController)
        }
        composable("information"){
            Information(navController = navController)
        }
        composable("card"){
            Cards(navController = navController)
        }
        composable("notification"){
            Notifications(navController = navController)
        }
        composable("setting"){
            Settings(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DayhanHasapTheme {
    }
}