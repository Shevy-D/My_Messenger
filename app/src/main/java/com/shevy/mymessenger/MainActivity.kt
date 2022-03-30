package com.shevy.mymessenger

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSendMessage(view: View) {
        var messageView: EditText = findViewById(R.id.message)
        var messageText: String = messageView.text.toString()
/*        intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("message", messageText)*/
        intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, messageText)
        val chooserTitle: String = getString(R.string.chooser)
        val chooserIntent: Intent = Intent.createChooser(intent, chooserTitle)
        startActivity(chooserIntent)
        //startActivity(intent)

    }
}