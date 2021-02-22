


package com.example.projecthome

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondClass: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        var textActTwo = findViewById<TextView>(R.id.textActTwo)
        var textActTwo1 = findViewById<TextView>(R.id.textActTwo1)
        var textActTwo2 = findViewById<TextView>(R.id.textActTwo2)
        var textActTwo3 = findViewById<TextView>(R.id.textActTwo3)
        textActTwo.text = intent.getStringExtra("key")
        textActTwo1.text = intent.getStringExtra("key1")
        textActTwo2.text = intent.getStringExtra("key2")
        textActTwo3.text = intent.getStringExtra("key3")

    }
}