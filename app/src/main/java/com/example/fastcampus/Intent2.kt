package com.example.fastcampus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent2.*
import kotlin.math.log

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)


        result.setOnClickListener {
            var number1 = intent.getIntExtra("number1", 0)
            var number2 = intent.getIntExtra("number2", 0)

            Log.d("number", "" + number1)
            Log.d("number", "" + number2)

            val result = number1 + number2
            val resultIntent = Intent()
            resultIntent.putExtra("result", result)

            setResult(RESULT_OK, resultIntent)
            finish() // -> Activity 종료

            // Stack
            // Intent2 -> 종료
            // Intent1              Intent1
        }
    }
}