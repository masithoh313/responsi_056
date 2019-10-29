package com.example.responsi056

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_dashboard.*

class dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        //val intent=intent
        val email=intent.getStringExtra("email")
        val password=intent.getStringExtra("password")
        val login=findViewById<TextView>(R.id.textView13)
        login.text="Email : "+email+"\nPassword : "+password

        button_back.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
