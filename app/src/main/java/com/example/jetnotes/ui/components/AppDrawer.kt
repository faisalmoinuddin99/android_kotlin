package com.example.jetnotes.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetnotes.ui.theme.JetNotesTheme
import com.example.jetnotes.ui.theme.JetNotesThemeSettings


@Composable
private fun AppDrawerHeader() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {

        Image(
            imageVector = Icons.Filled.Menu,
            contentDescription = "Drawer Header Icon",
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "JetNotes",
            modifier = Modifier
                .align(Alignment.CenterVertically)
        )
    }
}

@Composable
private fun ScreenNavigationButton(
    icon: ImageVector,
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val colors = MaterialTheme.colorScheme

    // Define alphas for the image for two different states
    // of the button: selected/unselected
    val imageAlpha = if (isSelected) {
        1f
    } else {
        0.6f
    }

    // Define color for the text for two different states
    // of the button: selected/unselected
    val textColor = if (isSelected) {
        colors.primary
    } else {
        colors.onSurface.copy(alpha = 0.6f)
    }

    // Define color for the background for two different states
    // of the button: selected/unselected
    val backgroundColor = if (isSelected) {
        colors.primary.copy(alpha = 0.12f)
    } else {
        colors.surface
    }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp, top = 8.dp),
        color = backgroundColor,
        shape = MaterialTheme.shapes.small
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable { onClick }
                .fillMaxWidth()
                .padding(4.dp)
        ) {
            Image(imageVector = icon, contentDescription = "Screen Navigation Button")
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.bodyMedium,
                color = textColor,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}


@Composable
private fun LightDarkThemeItem() {
    Row {
        Text(text = "Turn on dark theme")
        Switch(checked = JetNotesThemeSettings.isDarkThemeEnabled, onCheckedChange = {
            JetNotesThemeSettings.isDarkThemeEnabled = it
        }
        )
    }
}

@Composable
@Preview
private fun AppDrawerHeaderPreview() {
    JetNotesTheme {
//        AppDrawerHeader()
//        ScreenNavigationButton(
//            icon = Icons.Filled.Home,
//            label = "Notes",
//            isSelected = true,
//            onClick = { }
//        )
        LightDarkThemeItem()
    }
}