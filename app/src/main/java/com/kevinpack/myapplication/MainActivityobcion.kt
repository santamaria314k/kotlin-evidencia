package com.kevinpack.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivityobcion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityobcion)


        val optx = findViewById<EditText>(R.id.optx)
        val respuesta = findViewById<TextView>(R.id.respuesta)
         val result=findViewById<Button>(R.id.result)





      result.setOnClickListener {
          val aleatorio = (1..3).random()
          val opcionElegida = optx.text.toString().toInt()
          respuesta.text = aleatorio.toString()

          when {
            aleatorio == opcionElegida ->respuesta.text = "empatado"
            aleatorio == 1 && opcionElegida == 2 -> respuesta.text = "salio papel perdio"
            aleatorio == 1 && opcionElegida == 3 -> respuesta.text = "salio papel gano"
            aleatorio == 2 && opcionElegida == 1 -> respuesta.text = "salio piedra gano"
            aleatorio == 2 && opcionElegida == 3 -> respuesta.text = "salio piedra perdio"
            aleatorio == 3 && opcionElegida == 1 -> respuesta.text = " salio tijera perdio"
            aleatorio == 3 && opcionElegida == 2 -> respuesta.text = "salio tijera gano"
            else ->respuesta.text = "resultado desconocido"

        } }
    }
}