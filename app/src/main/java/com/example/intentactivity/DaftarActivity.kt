package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.intentactivity.databinding.ActivityDaftarBinding

class DaftarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaftarBinding

    companion object {
        const val EXTRA_USERNAME = "masukan username anda"
        const val EXTRA_EMAIL = "masukan email anda"
        const val EXTRA_PHONE = "nomor handphone"
        const val EXTRA_PASSWORD = "masukan password anda"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaftarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

            btnRegister.setOnClickListener{

                val intentToHome = Intent(this@DaftarActivity,HomepageActivity::class.java)

                val username = edtUsername.text.toString()
                val email = masukanEmail.text.toString()
                val phone = masukanPhone.text.toString()
                val password = masukanPass.text.toString()

                intentToHome.putExtra(EXTRA_USERNAME, username)
                intentToHome.putExtra(EXTRA_EMAIL, email)
                intentToHome.putExtra(EXTRA_PHONE, phone)
                intentToHome.putExtra(EXTRA_PASSWORD, password)

                startActivity(intentToHome)

            }
        }

        val btnToLogin = findViewById<TextView>(R.id.btn_to_login)

        btnToLogin.setOnClickListener {
            val intentToLogin = Intent(this@DaftarActivity, HalamanloginActivity::class.java)
            startActivity(intentToLogin)
        }

    }
}