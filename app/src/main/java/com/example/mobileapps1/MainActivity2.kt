package com.example.mobileapps1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity(R.layout.activity_main2) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nextPageButton = findViewById<Button>(R.id.nextPageButton)
        nextPageButton.setOnClickListener{

//             this creates a new activity
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)

//            do not use onDestroy to end an activity
        // onDestroy()
            finish()
        }
    }

    @Deprecated("For learning purposes only")
    override fun onBackPressed() {
        super.onBackPressed()
        Log.e("m2", "Back button pressed")
    }

}