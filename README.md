# ☕ Sistem Pemesanan Menu Café (Android)

Aplikasi Android sederhana berbasis **Kotlin** yang dikembangkan sebagai tahap awal dari sistem pemesanan menu café.
Pada versi ini, aplikasi sudah mengimplementasikan fitur **Login & Register** sebagai dasar autentikasi pengguna.

---

## 📌 Deskripsi

Aplikasi ini dibuat untuk memahami konsep dasar:

* Autentikasi user (Login & Register)
* Penyimpanan data lokal
* Alur navigasi antar halaman di Android

Ke depannya, aplikasi ini akan dikembangkan menjadi **Sistem Pemesanan Menu Café** yang lengkap.

---

## ✨ Fitur yang Sudah Dibuat

* 🔐 Login user
* 📝 Register user
* 👥 Multi akun (lebih dari 1 user)
* 💾 Penyimpanan data menggunakan SharedPreferences
* ⚠️ Validasi input (tidak boleh kosong & password harus sama)
* 🔄 Navigasi antar halaman (Login → Dashboard)

---

## 🚀 Fitur yang Akan Dikembangkan (Café System)

* 📋 Menampilkan daftar menu makanan & minuman
* 🛒 Keranjang pesanan (cart)
* 💰 Perhitungan total harga
* 📦 Proses pemesanan
* 🧾 Riwayat transaksi user
* 👤 Akun user untuk masing-masing pelanggan

---

### Dashboard

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/ee6711ac-51e3-498d-b70e-6bc6e7cf8ec4" />


### Login

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/4a706514-0116-4101-9253-ad4c353259c2" />


### Register

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/e13a74cc-2922-4cb3-8553-18b135df684a" />


## 🛠️ Teknologi yang Digunakan

* Kotlin
* Android Studio
* XML Layout
* SharedPreferences

---

## 📂 Struktur Project

```bash
app/
├── java/com/praktikum/praktikumpertemuan3/
│   ├── AwalActivity.kt
│   ├── LoginActivity.kt
│   ├── RegisterActivity.kt
│   ├── DashboardActivity.kt
│   └── UserData.kt
│
└── res/layout/
    ├── activity_awal.xml
    ├── activity_login.xml
    ├── activity_register.xml
    └── activity_dashboard.xml
```

---

## ⚙️ Cara Menjalankan Project

1. Clone repository ini:

   ```bash
   git clone https://github.com/username/praktikum3-login.git
   ```
2. Buka di Android Studio
3. Tunggu proses Gradle selesai
4. Jalankan di Emulator / HP Android
5. Register akun baru
6. Login dan masuk ke dashboard

---

## 🧠 Cara Kerja Aplikasi

* Data user disimpan menggunakan **SharedPreferences**
* Saat Register:

  * Email dan password disimpan ke dalam sistem
* Saat Login:

  * Input user dicocokkan dengan data yang tersimpan
* Jika sesuai:

  * User berhasil login dan masuk ke dashboard
* Jika tidak:

  * Muncul pesan error

---

## ⚠️ Keterbatasan

* Data hanya tersimpan di perangkat (local)
* Belum menggunakan database (SQLite / Room)
* Belum ada enkripsi password
* Belum terhubung ke internet / server

---

## 🔥 Pengembangan Selanjutnya

* 🔐 Integrasi Firebase Authentication
* 🗄️ Menggunakan Room Database
* 🎨 UI lebih modern (Material Design)
* 🌐 Integrasi API backend
* 🔒 Keamanan data user (enkripsi)

---

## 👨‍💻 Tim Pengembang (Kelompok 4)

* Risma Ramadhani
* Wizad Akmalia Zulfa
* Zefanya Christian Natasha

---

## 📌 Kesimpulan

Aplikasi ini merupakan tahap awal dalam pengembangan sistem pemesanan menu café, dengan fokus pada autentikasi user sebagai fondasi utama sebelum masuk ke fitur pemesanan.

---


