package com.kenowa.appfinal

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Establecer mi toolbar como toolbar de la actividad
        setSupportActionBar(findViewById(R.id.toolbar))

        // Imprimir el correo ingresado
        val datosRegistrados = intent.extras
        tv_correo_lb.text = datosRegistrados?.getString("correo")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_overflow, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val datosRegistrados = intent.extras
        val correo = datosRegistrados?.getString("correo")
        val clave = datosRegistrados?.getString("clave")
        if (item.itemId == R.id.volverLogin) {
            val intent = Intent( this, LoginActivity::class.java )
            intent.putExtra( "correo", correo )
            intent.putExtra( "clave", clave )
            startActivity(intent)
            finish()
        }
        return true
    }
}