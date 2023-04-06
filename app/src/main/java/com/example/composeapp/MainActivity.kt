package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
//           call composable unit
            Column {
                Greeting()
                Greeting2()
            }
        }
    }
//    @Preview allow quick look at things
    @Preview
    @Composable
//inside you can define function
    fun Greeting(){
//    unit composable called column
    Column {
        Text("Francis Mung'ang'u", style = TextStyle(color = Color.Red, fontWeight = FontWeight.Bold))
        Text("Joseph", style = TextStyle(color = Color.Red, fontWeight = FontWeight.Light))
        Text("Celestin", style = TextStyle(color = Color.Red, fontSize = 20.sp))
    }
    }
    @Preview
    @Composable
    fun Greeting2(){
        Column {
            Text("Francis Mung'ang'u", style = TextStyle(color = Color.Gray, fontStyle = FontStyle.Italic))
            Text("Joseph", style = TextStyle(color = Color.Gray), modifier = Modifier.padding(all = 20.dp))
            Text("Celestin", style = TextStyle(color = Color.Gray))
        }
    }
//    https://www.tutorialkart.com/android-jetpack-compose/  : link for check button for cards and images
}

