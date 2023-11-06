package com.example.home_application_demo.screens

import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.home_application_demo.R


@Composable
fun MyBox(
    modifier: Modifier = Modifier,
    contentModifier: Modifier = Modifier,
) {
    Box(modifier = modifier.fillMaxSize()) {
        CustomText(
            text = stringResource(id = R.string.first),
            modifier = Modifier.align(Alignment.TopStart)
        )
        CustomText(
            text = stringResource(id = R.string.second),
            modifier = Modifier.align(Alignment.Center)
        )
        CustomText(
            text = stringResource(id = R.string.third),
            modifier = Modifier.align(Alignment.BottomEnd)
        )

    }
}

@Composable
fun CustomText(
    text: String,
    fontSize: TextUnit = 22.sp,
    modifier: Modifier = Modifier,
) {
    Text(text = text, fontSize = fontSize, modifier = modifier)
}
