package com.example.home_application_demo.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.home_application_demo.R

@Composable
fun MyAlertDialog() {

    val shouldShowDialog = remember {
        mutableStateOf(true)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (shouldShowDialog.value) {
            AlertDialog(onDismissRequest = {
                shouldShowDialog.value = false
            },
                title = {
                    Text(text = stringResource(id = R.string.alert_dialog_title))

                },
                text = {
                    Text(text = stringResource(id = R.string.alert_dialog_text))
                }, confirmButton = {
                    Button(
                        onClick = {
                            shouldShowDialog.value = false
                        },
                        colors = ButtonDefaults.buttonColors(
                            contentColor = colorResource(id = R.color.white),
                            containerColor = Color.Green
                        ),
                        content = {
                           Text(text = stringResource(id = R.string.alert_dialog_confirm))
                        },
                    ) 
                })
        }
    }
}