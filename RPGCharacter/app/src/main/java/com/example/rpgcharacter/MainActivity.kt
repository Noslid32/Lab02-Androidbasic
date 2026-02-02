package com.example.rpgcharacter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                CharacterScreen()
            }
        }
    }
}

@Composable
fun CharacterScreen() {
    var vit by remember { mutableIntStateOf(10) }
    var dex by remember { mutableIntStateOf(10) }
    var wis by remember { mutableIntStateOf(10) }

    val total = vit + dex + wis

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "RPG Character Sheet",
            style = MaterialTheme.typography.headlineSmall
        )

        StatRow("VIT", vit) { vit = rollStat() }
        StatRow("DEX", dex) { dex = rollStat() }
        StatRow("WIS", wis) { wis = rollStat() }

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        Text(
            text = "Total Score: $total",
            style = MaterialTheme.typography.titleMedium
        )

        when {
            total <= 30 -> {
                Text("Mal personaje ", color = Color.Red)
            }
            total >= 50 -> {
                Text("Buen personaje ", color = Color(0xFF2E7D32))
            }
        }
    }
}


@Composable
fun StatRow(
    name: String,
    value: Int,
    onRoll: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(name, style = MaterialTheme.typography.titleMedium)
            Text(value.toString(), style = MaterialTheme.typography.titleMedium)
            Button(onClick = onRoll) {
                Text("Roll")
            }
        }
    }
}

fun rollStat(): Int = Random.nextInt(3, 19)
