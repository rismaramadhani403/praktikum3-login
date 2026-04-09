package com.praktikum.praktikumpertemuan3

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLoginProses)

        btnLogin.setOnClickListener {

            val inputEmail = email.text.toString().trim()
            val inputPassword = password.text.toString().trim()

            if (inputEmail.isEmpty() || inputPassword.isEmpty()) {
                Toast.makeText(this, "Isi semua field!", Toast.LENGTH_SHORT).show()

            } else {

                val sharedPref = getSharedPreferences("USER_DATA", MODE_PRIVATE)

                // ambil password berdasarkan email
                val savedPassword = sharedPref.getString(inputEmail, null)

                if (savedPassword != null && inputPassword == savedPassword) {

                    Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()

                    // PINDAH KE DASHBOARD
                    startActivity(Intent(this, DashboardActivity::class.java))
                    finish()

                } else {
                    Toast.makeText(this, "Email atau Password salah!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}