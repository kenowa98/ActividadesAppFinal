package com.kenowa.appfinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val datosRegistrados = intent.extras

        btn_registro.setOnClickListener {
            val intent = Intent( this, RegistroActivity::class.java )
            startActivity(intent)
        }

        btn_login.setOnClickListener {
            val correo = datosRegistrados?.getString("correo")
            val clave = datosRegistrados?.getString("clave")
            if (et_email.text.toString() == correo && et_clave.text.toString() == clave) {
                val intent = Intent( this, MainActivity::class.java )
                intent.putExtra( "correo", correo )
                intent.putExtra( "clave", clave )
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            } else {
                Toast.makeText(this, "Correo y/o contraseña incorrecta", Toast.LENGTH_SHORT).show()
            }
        }
    }

    /*override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }*/

    override fun onStart() {
        super.onStart()
        Log.d("OnStart1", "ok")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnResume1", "ok")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnPause1", "ok")
    }

    override fun onStop() {
        super.onStop()
        Log.d("OnStop1", "ok")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("OnRestart1", "ok")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OnDestroy1", "ok")
    }

    /*override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1234 && resultCode == Activity.RESULT_OK) {
            val correo = data?.extras?.getString("correo")
            val clave = data?.extras?.getString("clave")
        }
    }*/
}