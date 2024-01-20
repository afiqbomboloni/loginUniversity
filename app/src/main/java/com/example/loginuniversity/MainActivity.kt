package com.example.loginuniversity

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTeacher = findViewById<Button>(R.id.buttonstudent)
        val buttonStudent = findViewById<Button>(R.id.buttonteacher)
        buttonTeacher.setOnClickListener {
            val intent = Intent(this, StudentActivity::class.java)
            startActivity(intent)
        }
        buttonStudent.setOnClickListener {
            val intent = Intent(this, TeacherActivity::class.java)
            startActivity(intent)
        }
    }
}
