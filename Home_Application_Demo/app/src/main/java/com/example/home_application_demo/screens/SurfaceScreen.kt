import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.home_application_demo.R
import com.example.home_application_demo.screens.MyColumn
import com.example.home_application_demo.screens.MyRow

@Composable
fun SurfaceScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        MySurface(modifier.align(Alignment.Center))
    }
}


@Composable
fun MySurface(modifier: Modifier) {

    Surface(
        modifier = modifier.size(100.dp), // 1
        color = androidx.compose.ui.graphics.Color.LightGray,
        border = BorderStroke(1.dp, androidx.compose.ui.graphics.Color.Green)
    ) {
        MyColumn()

    }

}