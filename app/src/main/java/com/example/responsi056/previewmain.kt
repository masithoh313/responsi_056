package com.example.responsi056

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_previewmain.*

class previewmain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previewmain)

        //val intent = intent
        val name = intent.getStringExtra("name")
        val nim = intent.getStringExtra("nim")
        val study = intent.getStringExtra("study")
        val faculty = intent.getStringExtra("faculty")
        val date = intent.getStringExtra("date")
        val address = intent.getStringExtra("address")

        val hasil = findViewById<TextView>(R.id.textView5)
        hasil.text =
            "Name : " + name + "\nNIM : " + nim + "\nStudy Programs : " + study + "\nFaculty ; " + faculty + "\nDate of birth : " + date + "\nAddress : " + address

        button_bck.setOnClickListener {
            val intent=Intent(this,register::class.java)
            startActivity(intent)
        }
        button_lgn.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }





    }
}
