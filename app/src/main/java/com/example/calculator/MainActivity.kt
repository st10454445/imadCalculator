package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var etNumber1: EditText?= null //on the activity etNum1
    private var etNumber2: EditText?= null //on the activity etNum2
    private var tvDisplay: TextView?= null //on the activity etNum3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNumber1)
        etNumber2 = findViewById<EditText>(R.id.etNumber2)
        tvDisplay = findViewById<TextView>(R.id.tvDisplay)

        val btnAddition = findViewById<Button>(R.id.btnAddition)
        btnAddition.setOnClickListener {
            add()
        }
        val btnSubtraction = findViewById<Button>(R.id.btnSubtraction)
        btnSubtraction.setOnClickListener {
            subt()
        }
        val btnMultiplication = findViewById<Button>(R.id.btnMultiplication)
        btnMultiplication.setOnClickListener {
            mult()
        }
        val btnDivision = findViewById<Button>(R.id.btnDivision)
        btnDivision.setOnClickListener {
            div()
        }
    }

    private fun add(){
        var intNumber1: Int = 0
        var intNumber2: Int = 0
        var intAnswer: Int = 0

        intNumber1 = etNumber1.text.toString().toInt()
        intNumber2 = etNumber2.text.toString().toInt()

        tvDisplay = intNumber1 + intNumber2
    }

    private fun subt(){

    }

    private fun mult(){

    }

    private fun div(){

    }
}