package com.example.applife


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sumbtn = findViewById<Button>(R.id.button)
        val subbtn = findViewById<Button>(R.id.button2)
        val mulbtn = findViewById<Button>(R.id.button3)
        val textV = findViewById<TextView>(R.id.textView)
        val editT = findViewById<EditText>(R.id.editText)
        val editT2 = findViewById<EditText>(R.id.editText2)

        sumbtn.setOnClickListener{

            textV.text = "${editT.text.toString().toInt() + editT2.text.toString().toInt()}"
        }
        subbtn.setOnClickListener{

            textV.text = "${editT.text.toString().toInt() - editT2.text.toString().toInt()}"
        }
        mulbtn.setOnClickListener{
            textV.text = "${editT.text.toString().toInt() * editT2.text.toString().toInt()}"
        }


        Log.d("LogAct","${textV.text.toString()} - onCreate")


    }

    override fun onStart() {
        super.onStart()
        val textV = findViewById<TextView>(R.id.textView)
        Log.d("LogAct","${textV.text.toString()} - onStart")
    }

    override fun onResume() {
        super.onResume()
        val textV = findViewById<TextView>(R.id.textView)
        Log.d("LogAct","${textV.text.toString()} - onResume")
    }

    override fun onPause() {
        super.onPause()
        val textV = findViewById<TextView>(R.id.textView)
        Log.d("LogAct","${textV.text.toString()} - onPause")
    }

    override fun onStop() {
        super.onStop()
        val textV = findViewById<TextView>(R.id.textView)
        Log.d("LogAct","${textV.text.toString()} - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        val textV = findViewById<TextView>(R.id.textView)
        Log.d("LogAct","${textV.text.toString()} - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        val textV = findViewById<TextView>(R.id.textView)
        Log.d("LogAct","${textV.text.toString()} - onDestroy")
    }



}