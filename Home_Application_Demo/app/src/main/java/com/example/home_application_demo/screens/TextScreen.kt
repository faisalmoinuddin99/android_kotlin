package com.example.home_application_demo.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.example.home_application_demo.R

@Composable
fun TextScreen(
    name: String,

    greeting: @Composable (name: String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyText()
        greeting.invoke(name)
    }
}

@Composable
fun MyText() {
    Text(stringResource(id = R.string.jetpack_compose),
        modifier = Modifier,
        fontSize = 10.sp
        )
}