package com.example.dayhanhasap.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dayhanhasap.R

@Composable
fun Register(navController: NavController){
    val firstName= remember { mutableStateOf("") }
    val lastName= remember { mutableStateOf("") }
    val email= remember { mutableStateOf("") }
    val password= remember { mutableStateOf("") }
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp), contentAlignment = Alignment.Center ){
        Column(modifier = Modifier
            .padding(10.dp)
            .size(height = 700.dp, width = 1000.dp)
            .background(
                colorResource(id = R.color.slate_100,),
                shape = RoundedCornerShape(30.dp)
            )
            ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Text(text = "Agza bolmak",fontSize = 30.sp,fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.green_700)
            )
            OutlinedTextField(
                value = email.value,
                label = { Text(text = "Ady")} ,
                modifier = Modifier
                    .padding(6.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                onValueChange = { email.value = it },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = colorResource(id = R.color.slate_300),
                    textColor = colorResource(id = R.color.black),
                    focusedIndicatorColor = colorResource(id = R.color.green_100),
                    focusedLabelColor = colorResource(id = R.color.green_500)
                ),
                shape = RoundedCornerShape(20.dp),
            )
            OutlinedTextField(
                value = email.value,
                label = { Text(text = "Familiýasy")} ,
                modifier = Modifier
                    .padding(6.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                onValueChange = { email.value = it },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = colorResource(id = R.color.slate_300),
                    textColor = colorResource(id = R.color.black),
                    focusedIndicatorColor = colorResource(id = R.color.green_100),
                    focusedLabelColor = colorResource(id = R.color.green_500)
                ),
                shape = RoundedCornerShape(20.dp),
            )
            OutlinedTextField(
                value = email.value,
                label = { Text(text = "Email")} ,
                modifier = Modifier
                    .padding(6.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                onValueChange = { email.value = it },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = colorResource(id = R.color.slate_300),
                    textColor = colorResource(id = R.color.black),
                    focusedIndicatorColor = colorResource(id = R.color.green_100),
                    focusedLabelColor = colorResource(id = R.color.green_500)
                ),
                shape = RoundedCornerShape(20.dp),
            )
            OutlinedTextField(
                value = password.value,
                label = { Text(text = "Açar söz")},
                modifier = Modifier
                    .padding(6.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                onValueChange = { password.value = it },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = colorResource(id = R.color.slate_300),
                    textColor = colorResource(id = R.color.black),
                    focusedIndicatorColor = colorResource(id = R.color.green_100),
                    focusedLabelColor = colorResource(id = R.color.green_500)

                ),

                shape = RoundedCornerShape(20.dp),
                visualTransformation = PasswordVisualTransformation()

            )
            Button(onClick = { navController.navigate("home") },modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(top = 10.dp, start = 6.dp, end = 6.dp)
                ,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.green_500),
                    contentColor = Color.White,
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = "Tassyklaň",fontSize = 20.sp)
            }
            Text(
                text = "Agza bolmak",
                Modifier.clickable { navController.navigate("register") },
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }

    }
}