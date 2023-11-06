package com.example.home_application_demo.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.home_application_demo.R


@Composable
fun MyColumn() {
    val THREE_ELEMENT_LIST = listOf(R.string.first, R.string.second, R.string.third)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        THREE_ELEMENT_LIST.forEach { elementID ->
            Text(
                text = stringResource(id = elementID),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
