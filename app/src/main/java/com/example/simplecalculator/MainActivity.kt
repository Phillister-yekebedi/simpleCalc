package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    lateinit var number1: TextView
    lateinit var number2: TextView
    lateinit var number3: TextView
    lateinit var button_add: Button
    lateinit var button_substract: Button
    lateinit var button_divide: Button
    lateinit var button_modulus: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//         add()
//         substract()
//         multiply()
//         modulus()


        fun add() {
            var sumNum1 = findViewById<EditText>(R.id.number1)
            var sumNum2 = findViewById<EditText>(R.id.number2)
            var button1 = findViewById<Button>(R.id.button_add)
            button1.setOnClickListener {
                var addNum1 = sumNum1.text.toString().toInt()
                var add2Num2 = sumNum2.text.toString().toInt()
                var answer = addNum1 + add2Num2
                Toast.makeText(this, "$answer", Toast.LENGTH_SHORT).show()
            }
        }

        fun substract() {
            var sublNum1 = findViewById<EditText>(R.id.number1)
            var subNum2 = findViewById<EditText>(R.id.number2)
            var button1 = findViewById<Button>(R.id.button_substract)
            button1.setOnClickListener {
                var substractNum1 = sublNum1.text.toString().toInt()
                var substract2Num2 = subNum2.text.toString().toInt()
                var difference = substractNum1 - substract2Num2
                Toast.makeText(this, "$difference", Toast.LENGTH_SHORT).show()
            }
        }
        fun multiply() {
            var mulNum1 = findViewById<EditText>(R.id.number1)
            var mulNum2 = findViewById<EditText>(R.id.number2)
            var button1 = findViewById<Button>(R.id.button_multiply)
            button1.setOnClickListener {
                var multiplyNum1 = mulNum1.text.toString().toInt()
                var multiply2Num2 = mulNum2.text.toString().toInt()
                var result = multiplyNum1 * multiply2Num2
                Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
            }
        }
        fun modulus(){
            var modNum1=findViewById<EditText>(R.id.number1)
            var modNum2=findViewById<EditText>(R.id.number2)
            var button1=findViewById<Button>(R.id.button_modulus)
            button1.setOnClickListener {
                var modulusNum1=modNum1.text.toString().toInt()
                var modulus2Num2=modNum2.text.toString().toInt()
                var result=modulusNum1*modulus2Num2
                Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
     }
        } }}
