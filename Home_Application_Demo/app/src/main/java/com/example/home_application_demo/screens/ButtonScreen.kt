package com.example.home_application_demo.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.home_application_demo.R
import com.google.android.gms.wallet.button.ButtonConstants

@Composable
fun ExploreButtonsScreen() {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyButton()
        MyRadioGroup()
        MyFloatingActionButton()
    }
}

@Composable
fun MyButton() {
    Button(
        onClick = { /*TODO*/
            println("Button respond received successfully")
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.black)
        ),

        border = BorderStroke(
            1.dp,
            color = colorResource(id = R.color.teal_200)
        )
    ) {
        Text(
            text = stringResource(id = R.string.button_text),
            color = colorResource(id = R.color.white)
        )
    }


}

@Composable
fun MyRadioGroup() {
    val radioButton = listOf(0, 1, 2, 3) // 1
    val selectedButton = remember {
        mutableStateOf(radioButton.last())
    }// 2
    Row {
        radioButton.forEach { index ->
            val isSelected = index == selectedButton.value
            val colors = RadioButtonDefaults.colors(
                selectedColor = colorResource(id = R.color.teal_200),
                unselectedColor = colorResource(id = R.color.white),
            ) //3
            RadioButton(selected = isSelected, onClick = { selectedButton.value = index }, colors = colors)
        }
    }

}

@Composable
fun MyFloatingActionButton() {

}