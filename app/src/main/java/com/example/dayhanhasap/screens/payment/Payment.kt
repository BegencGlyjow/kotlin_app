package com.example.dayhanhasap.screens.payment

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dayhanhasap.R
import kotlinx.coroutines.launch

@Composable
fun Payment(navController: NavController){
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = { Text(text = "Tölegler",
                    color = Color.Black)
                },
                navigationIcon = {
                    Icon(painter = painterResource (id = com.example.dayhanhasap.R.drawable.menu_icon),
                        contentDescription = "",
                        modifier = Modifier.size(50.dp).padding(start = 15.dp).clickable {
                            scope.launch { scaffoldState.drawerState.open()
                            } })
                },
                backgroundColor = colorResource(id = R.color.white),
            )
        },
        content = {},

    )
}