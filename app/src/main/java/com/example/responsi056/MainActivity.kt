package com.example.responsi056

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.provider.ContactsContract
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Email = findViewById<EditText>(R.id.editText3)
        val Password = findViewById<EditText>(R.id.editText4)



        button_login.setOnClickListener {
            val email = Email.text.toString()
            val password = Password.text.toString()
            if (email.equals("haha@gmail.com") && password.equals("12345")){
                //toast("* success !", Toast.LENGTH_LONG)
                val intent = Intent(this, dashboard::class.java)
                intent.putExtra("email", email)
                intent.putExtra("password", password)
                startActivity(intent)
            } else  {

                toast("please register !",Toast.LENGTH_LONG)
            }
        }
        button_register.setOnClickListener {
            intent= Intent(this,register::class.java)
            startActivity(intent)
        }
    }
    fun toast(message: String,lengthLong: Int=Toast.LENGTH_LONG){
        Toast.makeText(this,message,lengthLong).show()
    }
}
