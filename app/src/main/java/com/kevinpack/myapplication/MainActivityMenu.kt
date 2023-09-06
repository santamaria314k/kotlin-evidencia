package com.kevinpack.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class MainActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)


        val calculadora = findViewById<ImageButton>(R.id.calculadora)
        val cartas = findViewById<ImageButton>(R.id.cartas)
        val dinero = findViewById<ImageButton>(R.id.dinero)
        val opcion = findViewById<ImageButton>(R.id.obcion)

        //calculadora
        calculadora.setOnClickListener {
            val ingrecal = Intent(this,MainActivity::class.java)
            startActivity(ingrecal)
        }
        //cartas
        cartas.setOnClickListener {
            val ingrecartas = Intent(this,MainActivitycartas::class.java)
            startActivity(ingrecartas)
        }

        //DINERO
        dinero.setOnClickListener {
            val ingredinero = Intent(this,MainActivityDinero::class.java)
            startActivity(ingredinero)
        }


        //OTRO
        opcion.setOnClickListener {
            val ingreobcion = Intent(this,MainActivityobcion::class.java)
            startActivity(ingreobcion)
        }


    }
}