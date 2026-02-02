package com.example.trafficlight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

enum class Light {
    Red, Yellow, Green
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                TrafficLightScreen()
            }
        }
    }
}

@Composable
fun TrafficLightScreen() {
    var currentLight by remember { mutableStateOf(Light.Red) }

    LaunchedEffect(Unit) {
        while (true) {
            currentLight = Light.Red
            delay(2000)
            currentLight = Light.Green
            delay(2000)
            currentLight = Light.Yellow
            delay(1000)
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LightCircle(isActive = currentLight == Light.Red, color = Color.Red)
        Spacer(modifier = Modifier.height(20.dp))
        LightCircle(isActive = currentLight == Light.Yellow, color = Color.Yellow)
        Spacer(modifier = Modifier.height(20.dp))
        LightCircle(isActive = currentLight == Light.Green, color = Color.Green)
    }
}

@Composable
fun LightCircle(isActive: Boolean, color: Color) {
    Box(
        modifier = Modifier
            .size(90.dp)
            .clip(CircleShape)
            .background(if (isActive) color else Color.Gray)
    )
}