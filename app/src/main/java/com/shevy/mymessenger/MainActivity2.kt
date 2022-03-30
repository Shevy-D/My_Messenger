package com.shevy.mymessenger

import android.content.ClipData.newIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        intent = intent
        val messageText: String? = intent.getStringExtra("message")
        val messageView: TextView = findViewById(R.id.message2)
        messageView.text = messageText
    }

    companion object {
        const val EXTRA_MESSAGE = "message"
    }
}