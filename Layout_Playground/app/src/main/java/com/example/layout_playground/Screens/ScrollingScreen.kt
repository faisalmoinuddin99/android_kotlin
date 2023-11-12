package com.example.layout_playground.Screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.layout_playground.R

@Composable
fun MyScrollingScreen(modifier: Modifier = Modifier) {
    Column {
        BookImage(
            imageResId = R.drawable.book_cover_1,
            contentDescriptionId = R.string.first_book_1
        )
        BookImage(
            imageResId = R.drawable.book_cover_2,
            contentDescriptionId = R.string.first_book_2
        )
        BookImage(
            imageResId = R.drawable.book_cover_3,
            contentDescriptionId = R.string.first_book_3
        )
    }
}


@Composable
fun BookImage(
    @DrawableRes imageResId: Int,
    @StringRes contentDescriptionId: Int
) {
    Image(
        bitmap = ImageBitmap.imageResource(imageResId),
        contentDescription = stringResource(id = contentDescriptionId),
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.size(476.dp, 616.dp)
    )
}