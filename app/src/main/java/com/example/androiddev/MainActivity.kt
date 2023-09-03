package com.example.androiddev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nowselected = "no"

        val radioGroup = findViewById<RadioGroup>(R.id.radiogroup)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId)
            {
                R.id.radio1-> {
                    nowselected = "롯데시네마"
                }
                R.id.radio2-> {
                    nowselected = "CGV"
                }
                R.id.radio3-> {
                    nowselected = "메가박스"
                }
            }
        }
        val button = findViewById<Button>(R.id.checkbtn)
        button.setOnClickListener {
            when(nowselected) {
                "no" -> Toast.makeText(applicationContext, "선택지를 선택해주세요", Toast.LENGTH_SHORT).show()
                "롯데시네마" -> Toast.makeText(applicationContext, "롯데시네마는 현재 상영중 입니다.", Toast.LENGTH_SHORT).show()
                "CGV" -> Toast.makeText(applicationContext, "CGV는 현재 상영중 입니다.", Toast.LENGTH_SHORT).show()
                "메가박스" -> Toast.makeText(applicationContext, "메가박스는 현재 상영중이 아닙니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}