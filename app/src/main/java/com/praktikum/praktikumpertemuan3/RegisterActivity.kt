package com.praktikum.praktikumpertemuan3

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama = findViewById<EditText>(R.id.etNama)
        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPassword)
        val konfirmasi = findViewById<EditText>(R.id.etKonfirmasi)
        val btnRegister = findViewById<Button>(R.id.btnRegisterProses)

        btnRegister.setOnClickListener {

            val inputNama = nama.text.toString().trim()
            val inputEmail = email.text.toString().trim()
            val inputPassword = password.text.toString().trim()
            val inputKonfirmasi = konfirmasi.text.toString().trim()

            if (inputNama.isEmpty() || inputEmail.isEmpty() ||
                inputPassword.isEmpty() || inputKonfirmasi.isEmpty()) {

                Toast.makeText(this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()

            } else if (inputPassword != inputKonfirmasi) {

                Toast.makeText(this, "Password tidak sama!", Toast.LENGTH_SHORT).show()

            } else {

                val sharedPref = getSharedPreferences("USER_DATA", MODE_PRIVATE)

                // CEK EMAIL SUDAH TERDAFTAR
                if (sharedPref.contains(inputEmail)) {

                    Toast.makeText(this, "Email sudah terdaftar!", Toast.LENGTH_SHORT).show()

                } else {

                    val editor = sharedPref.edit()

                    // SIMPAN MULTI AKUN (email = key, password = value)
                    editor.putString(inputEmail, inputPassword)
                    editor.apply()

                    Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()

                    // PINDAH KE LOGIN
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                }
            }
        }
    }
}