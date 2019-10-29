package com.example.responsi056

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val Name=findViewById<EditText>(R.id.editText)
        val NIM=findViewById<EditText>(R.id.editText6)
        val Study=findViewById<EditText>(R.id.editText7)
        val Faculty=findViewById<EditText>(R.id.editText8)
        val Date=findViewById<EditText>(R.id.editText2)
        val Address=findViewById<EditText>(R.id.editText5)

        button_preview.setOnClickListener {
            val name=Name.text.toString()
            val nim=NIM.text.toString()
            val study=Study.text.toString()
            val faculty=Faculty.text.toString()
            val date=Date.text.toString()
            val address=Address.text.toString()

            val intent= Intent(this,previewmain::class.java)
            intent.putExtra("name",name)
            intent.putExtra("nim",nim)
            intent.putExtra("study",study)
            intent.putExtra("faculty",faculty)
            intent.putExtra("date",date)
            intent.putExtra("address",address)
            startActivity(intent)
        }

    }
}
