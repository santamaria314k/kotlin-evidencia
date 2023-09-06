package com.kevinpack.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.cos

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        val botonSumar = findViewById<Button>(R.id.boton)
        val bresta = findViewById<Button>(R.id.brestar)
        val bmultiplicacion = findViewById<Button>(R.id.bmultiplicar)
        val bdivision = findViewById<Button>(R.id.bdividir)
        val becuasion = findViewById<Button>(R.id.becuasion)



        val numero1 = findViewById<EditText>(R.id.numero1)
        val numero2 = findViewById<EditText>(R.id.numero2)
        val numero3 = findViewById<EditText>(R.id.numero3)


        val textResultado = findViewById<TextView>(R.id.resultado)
        val textRestado = findViewById<TextView>(R.id.restado)
        val textMultiplicado = findViewById<TextView>(R.id.multiplicado)
        val textDividido = findViewById<TextView>(R.id.dividido)
        val textEcuasionado = findViewById<TextView>(R.id.ecuacionado)


        botonSumar.setOnClickListener {
            val recogerNum1 = numero1.text.toString().toDouble()
            val recogerNum2 = numero2.text.toString().toDouble()
            val resultado = recogerNum1 + recogerNum2
            textResultado.setText(resultado.toString())
        }

        bresta.setOnClickListener {
            val recogerNum1 = numero1.text.toString().toDouble()
            val recogerNum2 = numero2.text.toString().toDouble()
            val res = recogerNum1 - recogerNum2
            textRestado.setText(res.toString())
        }

        bmultiplicacion.setOnClickListener {
            val recogerNum1 = numero1.text.toString().toDouble()
            val recogerNum2 = numero2.text.toString().toDouble()
            val mul = recogerNum1 * recogerNum2
            textMultiplicado.setText(mul.toString())
        }

        bdivision.setOnClickListener {
            val recogerNum1 = numero1.text.toString().toDouble()
            val recogerNum2 = numero2.text.toString().toDouble()

            if (recogerNum2 != 0.0) {
                val div = recogerNum1 / recogerNum2
                textDividido.setText(div.toString())
            } else {
                textDividido.setText("Error =>0")
            }
        }

        becuasion.setOnClickListener {
            val recogerNum3 = numero3.text.toString().toDouble()


            val conversionrd = Math.toRadians(recogerNum3)
            val coseno = cos(conversionrd)
            textEcuasionado.setText(coseno.toString())
        }




    }
}