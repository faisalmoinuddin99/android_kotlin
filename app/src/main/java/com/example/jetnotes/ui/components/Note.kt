package com.example.jetnotes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetnotes.R
import com.example.jetnotes.ui.theme.green

@Composable
fun Note() {

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
       NoteColor(color = green, size = 40.dp, border = 1.dp, padding = 4.dp)
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(text = "Title", maxLines = 1)
            Text(text = "Content", maxLines = 1)
        }
        Checkbox(
            checked = false, onCheckedChange = {},
            modifier = Modifier.padding(start = 8.dp)
        )
    }

}

@Preview
@Composable
private fun NotePreview() {
    Note()
}