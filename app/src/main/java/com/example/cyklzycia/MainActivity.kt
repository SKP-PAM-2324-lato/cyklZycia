package com.example.cyklzycia

import android.icu.util.Calendar
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("metody", "wywowołano onCreate()")

        val calendar = findViewById<CalendarView>(R.id.calendar)

        calendar.setOnDateChangeListener { view, year, month, dayOfMonth ->
            //findViewById<TextView>(R.id.result).text = "$year - $month - $dayOfMonth"
            val date = LocalDate.of(year, month+1, dayOfMonth)
            findViewById<TextView>(R.id.result).text = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            //findViewById<TextView>(R.id.result).text = date.toString()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("metody", "wywowołano onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("metody", "wywowołano onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("metody", "wywowołano onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("metody", "wywowołano onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("metody", "wywowołano onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("metody", "wywowołano onRestart()")
    }


}