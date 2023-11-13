package com.example.layout_playground.Screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.layout_playground.R
import com.example.layout_playground.model.BookCategory


private val items = listOf(
    BookCategory(
        R.string.android,
        listOf(
            R.drawable.saving_data_android,
            R.drawable.android_aprentice,
            R.drawable.advanced_architecture_android
        )
    ),
    BookCategory(
        R.string.swift,
        listOf(
            R.drawable.swift_apprentice,
            R.drawable.rx_swift,
            R.drawable.combine
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
        R.string.ios,
        listOf(
            R.drawable.ios_apprentice,
            R.drawable.core_data
        )
    )
)

@Composable
fun ListScreen() {

}
/*
Internal Working of LazyColumn -

    @Composable Annotation:
        This annotation indicates that the following function is a Composable function.
         Composable functions are used in Jetpack Compose to define UI components.

    LazyColumn:
        LazyColumn is a Compose component that lazily composes and lays out its children
        items as they become visible on the screen. It's an efficient way to handle long
        lists of data without loading everything into memory at once.

    items Function:
        The items function is used within LazyColumn to iterate over a list of data
        (items in this case).
        It takes two parameters: the list of items (items) and a lambda function that
        defines how to compose each item in the list.

    Lambda Function Inside items:
        The lambda function (item -> ListItem(item)) is executed for each item in the
        items list.
        It takes a single parameter (item), representing an element from the items list.

    ListItem Function:
        The ListItem function is called for each item in the items list.
        The item parameter is passed to the ListItem function, which is expected to
         handle the UI representation of the given item.

       In summary, the MyList composable function uses a LazyColumn to efficiently handle a
       list of items. It uses the items function to iterate over the list (items) and calls
       the ListItem function for each item in the list. The actual UI representation of each
       item is delegated to the ListItem function, which you may implement elsewhere in your
       code. This structure allows for a clean and efficient way to display lists in
       a Compose UI.
 */
@Composable
fun MyList() {
    LazyColumn{
        items(items) {
            item -> ListItem(item)
        }
    }
}

@Composable
fun ListItem(
    bookCategory: BookCategory,
    modifier: Modifier = Modifier
) {

}