package com.kevinpack.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivityDinero : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dinero)


        var saldo=0.0
        val monto = findViewById<EditText>(R.id.monto)
        val consignar = findViewById<Button>(R.id.consignar)
        val retirar = findViewById<Button>(R.id.retirar)

        consignar.setOnClickListener {
            val montoString = monto.text.toString()
            if (montoString.isNotEmpty()) {
                val montoAAgregar = montoString.toDouble()
                saldo += montoAAgregar
                Toast.makeText(this, "El saldo es de : ${saldo}", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "¡ vacio!", Toast.LENGTH_SHORT).show()
            }
        }


        retirar.setOnClickListener {
            val montoString = monto.text.toString()
            if (montoString.isNotEmpty()) {
                val montoARetirar = montoString.toDouble()
                if (saldo >= montoARetirar) {
                    saldo -= montoARetirar

                    Toast.makeText(this, "El saldo es de : ${saldo}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "¡No tienes suficiente saldo!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "¡ vacio!", Toast.LENGTH_SHORT).show()
            }
        }






    }
}