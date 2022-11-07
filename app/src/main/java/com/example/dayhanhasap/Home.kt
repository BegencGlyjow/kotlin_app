package com.example.dayhanhasap

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.launch

@Composable
fun Home(navController: NavController) {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = { Text(text = "Baş sahypa",
                    color = Color.Black)
                },
                navigationIcon = {
                    Icon(painter = painterResource(id = R.drawable.menu_icon),
                        contentDescription = "",
                        modifier = Modifier.size(50.dp).padding(start = 15.dp).clickable {
                            scope.launch { scaffoldState.drawerState.open()
                            } })
                },
                backgroundColor = colorResource(id = R.color.white),
            )
        },
        content = {
//            if (newItem.value == 0) {
//                Text(text = "Login", fontSize = 30.sp)
//            }
//            if (newItem.value == 1) {
//                Text(text = "Register",fontSize = 30.sp)
//            }
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .fillMaxSize()) {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(40.dp))
                    .height(150.dp)
                    .background(colorResource(id = R.color.green_100))){
                    Text(text = "Welaýatlar : 5", fontSize =30.sp, modifier = Modifier.padding(30.dp))
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(40.dp))
                    .height(150.dp)
                    .background(colorResource(id = R.color.pink_100))){
                    Text(text = "Etraplar : 49", fontSize =30.sp, modifier = Modifier.padding(30.dp))
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .background(colorResource(id = R.color.blue_100))){
                    Text(text = "Daýhan birleşikler : 34", fontSize =30.sp, modifier = Modifier.padding(30.dp))
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(40.dp))
                    .height(150.dp)
                    .background(colorResource(id = R.color.lime_100))){
                    Text(text = "Ýaramly ýerler : 68", fontSize =30.sp, modifier = Modifier.padding(30.dp))
                }
            }
        },
        drawerContent = {
            Column(modifier = Modifier
                .fillMaxWidth()
                .size(100.dp)
                .background(color = colorResource(id = R.color.lime_100)),
                horizontalAlignment = Alignment.CenterHorizontally) {
//                ImageBitmap.imageResource(id = R.drawable.logo)
//                Image(painter = painterResource(id = R.drawable.logo), contentDescription = "")
                Text(text = "Dayhan",fontSize = 20.sp,modifier = Modifier.padding(top = 10.dp,start = 6.dp))
            }
            DropdownMenuItem(onClick = {  }) {
                Icon(painter = painterResource(id = R.drawable.home_icon), contentDescription = "")
                Text(text = "Baş sahypa", fontSize = 20.sp,modifier = Modifier.padding(start = 10.dp))
            }
            DropdownMenuItem(onClick = {  navController.navigate("information") }) {
                Icon(painter = painterResource(id = R.drawable.map_icon), contentDescription = "")
                Text(text = "Maglumatlar",fontSize = 20.sp,modifier = Modifier.padding(start = 10.dp))
            }
            DropdownMenuItem(onClick = { navController.navigate("payment") }) {
                Icon(painter = painterResource(id = R.drawable.payment_icon), contentDescription = "")
                Text(text = "Tölegeler",fontSize = 20.sp,modifier = Modifier.padding(start = 10.dp))
            }
            DropdownMenuItem(onClick = { navController.navigate("card") }) {
                Icon(painter = painterResource(id = R.drawable.card_icon), contentDescription = "")
                Text(text = "Kartlarym",fontSize = 20.sp,modifier = Modifier.padding(start = 10.dp))
            }
            DropdownMenuItem(onClick = { navController.navigate("notification") }) {
                Icon(painter = painterResource(id = R.drawable.notifi_icon), contentDescription = "")
                Text(text = "Bildirişler",fontSize = 20.sp,modifier = Modifier.padding(start = 10.dp))
            }
            DropdownMenuItem(onClick = { navController.navigate("setting") }) {
                Icon(painter = painterResource(id = R.drawable.setting_icon), contentDescription = "")
                Text(text = "Sazlamalar",fontSize = 20.sp,modifier = Modifier.padding(start = 10.dp))
            }
        }

    )
}