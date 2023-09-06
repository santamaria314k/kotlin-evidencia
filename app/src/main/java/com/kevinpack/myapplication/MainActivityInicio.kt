package com.kevinpack.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivityInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_inicio)






        val usuario =findViewById<EditText>(R.id.usuario)

        val clave =findViewById<EditText>(R.id.clave)


        val botonIniciar=findViewById<Button>(R.id.buttoniniciar)

        botonIniciar.setOnClickListener {

            if (usuario.text.toString().equals("kevin")&& clave.text.toString().equals("123")){

                val intento = Intent(this,MainActivityMenu::class.java)
                startActivity(intento)
                Toast.makeText(this, "¡Bienvenido! ${usuario.text.toString()}", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "¡Datos incorrectos!", Toast.LENGTH_SHORT).show()}
        }








    }
}