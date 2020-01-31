package com.example.exer1_aquino_diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        val countUpButton : Button = findViewById(R.id.count_up_button)
        val resultText : TextView = findViewById(R.id.result_text)

        rollButton.setOnClickListener{ rollDice(resultText) }
        countUpButton.setOnClickListener{ countUp(resultText) }
    }

    private fun rollDice(resultText : TextView) {
        val randomInt = (1..50).random()
        Toast.makeText(this, "ROLL BUTTON CLICKED", Toast.LENGTH_SHORT).show()
        resultText.text = randomInt.toString()
    }

    private fun countUp(resultText: TextView) {
        var currInt = 24

        if(resultText.text != "Hello User!") currInt = Integer.parseInt(resultText.text.toString())
        if(currInt != 50) currInt++

        resultText.text = currInt.toString()
    }
}
