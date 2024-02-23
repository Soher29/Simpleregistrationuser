package com.example.simpleregistrationuser

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var buttonLogin: Button
    lateinit var editTextPassword: EditText
    lateinit var editTextEmailAddress: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        auth = FirebaseAuth.getInstance()
        editTextPassword = findViewById(R.id.editTextPassword)

        editTextEmailAddress = findViewById(R.id.editTextEmailAddress)
        buttonLogin = findViewById(R.id.buttonRegister)
        buttonLogin.setOnClickListener {
            login()
        }
        val forgotPassTxt = findViewById<TextView>(R.id.forgotpasstxt)
        forgotPassTxt.setOnClickListener {
            startActivity(Intent(this,ForgotActivity::class.java))
        }
    }

  private fun login() {
     startActivity(Intent(this, TrialdayActivity::class.java))
 }

}



