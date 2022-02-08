package com.example.yanassral

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.textView)
        view.text = "YANASSAL"
        val student: Student = Student("Leonid", 3)
        print(student.name)
    }
}

data class Student(val name: String, val course: Int) {

    override fun toString(): String {
        return "Студент $name учится на $course курсе"
    }
}