package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// This activity allows use to roll a dice and veiw result
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    //roll dice and update result on screen
    private fun rollDice() {
        val dice = Dice(6) // create new dice obj with 6 side and roll it
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView2) // upd screen with dice roll
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int = (1..numSides).random()
}