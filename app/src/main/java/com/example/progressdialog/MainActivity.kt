package com.example.progressdialog

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prgDialog = ProgressDialog(this@MainActivity)
        val startBtn =findViewById<Button>(R.id.start) as Button
        startBtn.setOnClickListener {
            prgDialog.setTitle("Progress Dialog")
            prgDialog.setMessage("This is Progress Dialog Box\n Click on the screen to dismiss")
            prgDialog.show()
        }
    }
}