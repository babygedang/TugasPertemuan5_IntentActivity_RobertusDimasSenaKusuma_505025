package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.intentactivi.Homepage2Activity
import com.example.intentactivity.databinding.ActivityHalamanloginBinding


class HalamanloginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHalamanloginBinding

    companion object {
        const val EXTRA_USERNAME = "username"
        const val EXTRA_PASSWORD = "password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanloginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

            btnLogin.setOnClickListener{

                val intentToHome = Intent(this@HalamanloginActivity, Homepage2Activity::class.java)

                val username = masukanUsername.text.toString()
                val password = masukanPass.text.toString()

                intentToHome.putExtra(DaftarActivity.EXTRA_USERNAME, username)
                intentToHome.putExtra(DaftarActivity.EXTRA_PASSWORD, password)

                startActivity(intentToHome)
            }
        }

        val btnForgotPassword = findViewById<TextView>(R.id.btn_forgot_password)

        btnForgotPassword.setOnClickListener {
            val intentToForgotPassword = Intent(this@HalamanloginActivity, LupaPasswordActivity::class.java)
            startActivity(intentToForgotPassword)
        }
        val btnToRegister = findViewById<TextView>(R.id.btn_to_register)

        btnToRegister.setOnClickListener {
            val intentToRegister = Intent(this@HalamanloginActivity, DaftarActivity::class.java)
            startActivity(intentToRegister)
        }

    }
}