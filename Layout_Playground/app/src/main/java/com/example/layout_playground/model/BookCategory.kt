package com.example.layout_playground.model

import androidx.annotation.StringRes

data class BookCategory(
    @StringRes val categoryResourceId: Int,
    val bookImageRes: List<Int>
)