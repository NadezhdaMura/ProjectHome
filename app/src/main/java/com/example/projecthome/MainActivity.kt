package com.example.projecthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainButton = findViewById<Button>(R.id.mainButton)
        var mainEditText = findViewById<EditText>(R.id.mainEditText)
        var mainEditText1 = findViewById<EditText>(R.id.mainEditText1)
        var mainEditText2 = findViewById<EditText>(R.id.mainEditText2)
        var mainEditText3 = findViewById<EditText>(R.id.mainEditText3)
        mainButton.setOnClickListener{
            val intent = Intent(this,SecondClass::class.java)
            intent.putExtra("key",mainEditText.text.toString())
            startActivity(intent)
            intent.putExtra("key1",mainEditText1.text.toString())
            startActivity(intent)
            intent.putExtra("key2",mainEditText2.text.toString())
            startActivity(intent)
            intent.putExtra("key3",mainEditText3.text.toString())
            startActivity(intent)
        }

                var incognito = findViewById<ImageView>(R.id.Incognito)
                incognito.setOnClickListener {
                    incognito.visibility = View.VISIBLE
            }
        }
    }
