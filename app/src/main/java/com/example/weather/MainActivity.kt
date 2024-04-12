package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.weather.layer.first

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.placeholder, first.newInstance()).commit()
        val place:TextView=findViewById(R.id.city)
        val cur_temp:TextView=findViewById(R.id.cur_temp)
        val mx_temp:TextView=findViewById(R.id.max_temp)
        val mn_temp:TextView=findViewById(R.id.min_temp)
        val description:TextView=findViewById(R.id.discription)
        val value:TextView=findViewById(R.id.sign1)

    }
}