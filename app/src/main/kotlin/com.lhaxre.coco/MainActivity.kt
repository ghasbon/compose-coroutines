package com.lhaxre.coco

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runBlocking {
            launch {
                Toast.makeText(this@MainActivity, "Inside launch!", Toast.LENGTH_LONG).show()
            }
            Toast.makeText(this@MainActivity, "Outside launch!", Toast.LENGTH_LONG).show()
        }
    }
}