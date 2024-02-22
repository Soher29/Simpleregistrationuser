package com.example.simpleregistrationuser

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ForgotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_passoword)

        val buttonresetPass = findViewById<Button>(R.id.nextresbtn)
        buttonresetPass.setOnClickListener{
            startActivity(Intent(this,ResetPasswordActivity::class.java))
        }
    }



}