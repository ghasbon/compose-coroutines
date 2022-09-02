package com.lhaxre.coco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runBlocking {
            setContent {
                Text("Hello World!")
            }
            launch {
                delay(2000)
                setContent {
                    Text("Hello World 2000!")
                }
            }
        }
    }
}