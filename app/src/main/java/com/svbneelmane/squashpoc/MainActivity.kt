package com.svbneelmane.squashpoc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.svbneelmane.squashpoc.ui.theme.SquashPoCTheme

class MainActivity : ComponentActivity() {
    // Demo Commit 1
    // Demo Commit 2
    // Demo Commit 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SquashPoCTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Squash 1
// Squash 2
// Squash 3
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


// Squash 1
// Squash 2
// Squash 3
// Squash 4
 @Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SquashPoCTheme {
        Greeting("Android")
    }
}