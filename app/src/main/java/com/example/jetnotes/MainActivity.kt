package com.example.jetnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold

import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetnotes.routing.Screen
import com.example.jetnotes.ui.components.AppDrawer
import com.example.jetnotes.ui.components.Note
import com.example.jetnotes.ui.theme.JetNotesTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNotesTheme {

                // 1. first create a drawer state hook to open - close drawer
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

                // 2. define scope coroutine
                val scope = rememberCoroutineScope()

                // 3. Use ModalNavigationDrawer composable function
                ModalNavigationDrawer(
                    drawerContent = {
                        ModalDrawerSheet {
                            /*
                            Currently our Navigation Screen is Hard coded
                             */
                            AppDrawer(currentScreen = Screen.Notes, onScreenSelected = {
                                scope.launch {
                                    drawerState.close()
                                }
                            })
                        }
                    },
                    drawerState = drawerState
                )
                /* Below Piece of code will display the content outside the navigation drawer hence
                its good to put Scaffold or any prefer layout

                 */
                {
                    Scaffold(
                        content = { innerPadding ->
                            Column(modifier = Modifier.padding(innerPadding)) {
                                Note()
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to chapter 6 -  $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetNotesTheme {
        Greeting("Android")
    }
}