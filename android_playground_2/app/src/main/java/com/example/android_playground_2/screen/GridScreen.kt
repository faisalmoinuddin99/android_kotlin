package com.example.android_playground_2.screen


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.android_playground_2.R


private val items = listOf(
    Icons.Filled.Check,
    Icons.Filled.Add,
    Icons.Filled.Build,
    Icons.Filled.Call,
    Icons.Filled.Edit,
    Icons.Filled.Face,
    Icons.Filled.DateRange,
    Icons.Filled.Email,
    Icons.Filled.Phone,
    Icons.Filled.Place,
    Icons.Filled.Person,
    Icons.Filled.Delete


)

@Composable
fun GridScreen() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        content = {
            items(items.size) { index ->
                GridIcon(iconResource = items[index])
            }
        }
    )
}

@Composable
fun GridIcon(
    iconResource: ImageVector
) {
    Icon(
        imageVector = iconResource,
        contentDescription = stringResource(id = R.string.grid_icon),
        tint = colorResource(id = R.color.colorPrimary),
        modifier = Modifier
            .size(80.dp)
            .padding(20.dp)
    )
}