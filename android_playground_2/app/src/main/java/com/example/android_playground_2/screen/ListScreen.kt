package com.example.android_playground_2.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_playground_2.R
import com.example.android_playground_2.model.BookCategory


private val items = listOf(
    BookCategory(
        R.string.android,
        listOf(
            R.drawable.android_aprentice,
            R.drawable.saving_data_android,
            R.drawable.advanced_architecture_android
        )
    ),
    BookCategory(
        R.string.ios,
        listOf(
            R.drawable.ios_apprentice,
            R.drawable.core_data
        )
    ),
    BookCategory(
        R.string.kotlin,
        listOf(
            R.drawable.kotlin_aprentice,
            R.drawable.kotlin_coroutines
        )
    ),
    BookCategory(
        R.string.swift,
        listOf(
            R.drawable.swift_apprentice,
            R.drawable.rx_swift,
            R.drawable.combine
        )
    )
)

@Composable
fun ListScreen() {
    MyList()
}

@Composable
fun MyList() {
    LazyColumn {
        items(items) { item ->
            ListItem(item)
        }
    }
}

@Composable
fun ListItem(
    bookCategory: BookCategory,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.padding(8.dp)
    ) {
        Text(
            text = stringResource(
                id = bookCategory.categoryResourceId
            ),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.colorPrimary)
        )
        Spacer(modifier = modifier.height(8.dp))
    }
}