package com.example.jetnotes.routing

sealed class Screen (val route: String){
    object Notes: Screen("Notes")
    object SaveNote: Screen("SaveNote")
    object Trash: Screen("Trash")
}