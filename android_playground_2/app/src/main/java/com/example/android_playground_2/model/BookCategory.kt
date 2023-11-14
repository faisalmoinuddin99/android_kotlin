package com.example.android_playground_2.model

import androidx.annotation.StringRes

data class BookCategory(
    @StringRes val categoryResourceId : Int,
    val bookImageRes : List<Int>
)