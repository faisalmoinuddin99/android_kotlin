package com.example.home_application_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.home_application_demo.screens.ExploreButtonsScreen
import com.example.home_application_demo.screens.MyAlertDialog
import com.example.home_application_demo.screens.MyColumn
import com.example.home_application_demo.screens.MyRadioGroup
import com.example.home_application_demo.screens.MyRow
import com.example.home_application_demo.screens.ProgressIndicatorScreen
import com.example.home_application_demo.screens.TextFieldScreen
import com.example.home_application_demo.screens.TextScreen
import com.example.home_application_demo.ui.theme.Home_Application_DemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            Home_Application_DemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    /* coming from TextScreen.kt file 1
                    TextScreen("Faisal Suleman") { name -> Greeting(name = name) }
                     */

                    /* coming from TextFieldScreen.kt file 2
                    TextFieldScreen()
                     */

                    /* coming from ButtonScreen.kt
                    ExploreButtonsScreen()

                     */

                    /* coming from ProgressIndicatorScreen.kt
                    ProgressIndicatorScreen()
                     */

                    /* coming from AlertDialogScree.kt
                    MyAlertDialog()

                     */
                    MyRow()

                }

            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = colorResource(id = R.color.purple_200),
        fontStyle = FontStyle.Italic
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Home_Application_DemoTheme {
        TextScreen(name = "Faisal Suleman") { name: String ->
            Greeting(name = name)
        }
        TextFieldScreen()
    }
}