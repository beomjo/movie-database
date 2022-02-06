package io.beomjo.moviedb.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import io.beomjo.moviedb.ui.theme.MyApplicationTheme

@Composable
fun MovieApp() {
    MyApplicationTheme {
        Surface(color = MaterialTheme.colors.background) {
            Greeting("Android")
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}