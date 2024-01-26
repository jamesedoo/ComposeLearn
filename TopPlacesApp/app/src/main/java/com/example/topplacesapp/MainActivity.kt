package com.example.topplacesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.topplacesapp.ui.theme.TopPlacesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopPlacesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TopPlacesApp("Android")
                }
            }
        }
    }
}

@Composable
fun TopPlacesApp(name: String, modifier: Modifier = Modifier) {
    TopPlacesItem()
}

@Composable
fun TopPlacesItem(modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            BasicInformation()
            MoreInformation()
        }
    }
}

@Composable
fun BasicInformation() {
    Column {
        Text(text = "fda")
        Text(text = "dfa")
        Image(painter = painterResource(id = R.drawable.byronbay), contentDescription = null)
    }
}

@Composable
fun MoreInformation() {
    Text(text = "dfa")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TopPlacesAppTheme {
        TopPlacesApp("Android")
    }
}