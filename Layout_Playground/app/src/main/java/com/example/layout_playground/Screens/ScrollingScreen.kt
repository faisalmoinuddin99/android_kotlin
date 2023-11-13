package com.example.layout_playground.Screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
    /* Vertical Scrolling
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),

        ) {
        BookImage(
            imageResId = R.drawable.book_cover_1, contentDescriptionId = R.string.first_book_1
        )

        BookImage(
            imageResId = R.drawable.book_cover_2, contentDescriptionId = R.string.first_book_2
        )

        BookImage(
            imageResId = R.drawable.book_cover_3, contentDescriptionId = R.string.first_book_3
        )
    }

     */

    // Horizontal Scrolling
    Row(
        modifier = modifier
            .horizontalScroll(rememberScrollState())
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        BookImage(imageResId = R.drawable.messi, contentDescriptionId = R.string.messi)
        BookImage(imageResId = R.drawable.ronaldo, contentDescriptionId = R.string.ronaldo)
        BookImage(imageResId = R.drawable.haaland, contentDescriptionId = R.string.haaland)
    }

}


@Composable
fun BookImage(
    @DrawableRes imageResId: Int, @StringRes contentDescriptionId: Int
) {
    Image(
        bitmap = ImageBitmap.imageResource(imageResId),
        contentDescription = stringResource(id = contentDescriptionId),
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.size(476.dp, 616.dp)
    )/*
   1. ContentScale.FillBounds -
        This can be useful in scenarios where you want the entire content to be
        visible and fill the available space, even if it means cropping some parts
        of the content. For example, this might be appropriate for a background
        image where you want to ensure that the entire screen is covered, regardless
        of the screen's aspect ratio.

    2. @DrawableRes -
        When you use @DrawableRes, it informs the compiler that the value assigned
        to that parameter or variable should be a valid drawable resource ID. This
        helps in preventing runtime crashes that may occur if an incorrect resource
        type is used.

    3. @StringRes -
        Similar to @DrawableRes, using @StringRes helps ensure that the provided value
        is a valid string resource ID, providing compile-time safety.
     */
}