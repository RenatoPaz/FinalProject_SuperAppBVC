import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Column(modifier = Modifier.fillMaxSize().background(Color.White).padding(16.dp)) {
//        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Logo")
        Text("FinalProject_SuperAppBVC", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
        Spacer(modifier = Modifier.height(16.dp))
        MenuItem("My Profile")
        MenuItem("Applications")
        MenuItem("Notifications")
        MenuItem("Progress")
        MenuItem("Groups")
        MenuItem("My schedule")
        MenuItem("Upcoming Events")
        MenuItem("Need help?")
    }
}

@Composable
fun MenuItem(text: String) {
    Text(
        text = text,
        fontSize = 18.sp,
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { /* TODO: Add navigation */ }
    )
}