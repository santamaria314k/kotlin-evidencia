package com.kevinpack.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

enum class MainActivitycarta {
    DIAMANTE,
    TREBOL,
    CORAZON,
    PICA
}

class MainActivitycartas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitycartas)

        var carta1 = findViewById<TextView>(R.id.carta1)
        var carta2 = findViewById<TextView>(R.id.carta2)
        var carta3 = findViewById<TextView>(R.id.carta3)
        var carta4 = findViewById<TextView>(R.id.carta4)

        val barajar = findViewById<Button>(R.id.barajar)

        barajar.setOnClickListener {
            val valoresEnum = MainActivitycarta.values()
            val cartaAleatoria = valoresEnum.random()
            val numeroAleatorio = Random.nextInt(1, 11)

            carta1.text = "${cartaAleatoria.name} $numeroAleatorio"

            val cartaAleatoria2 = valoresEnum.random()
            val numeroAleatorio2 = Random.nextInt(1, 11)

            carta2.text = "${cartaAleatoria2.name} $numeroAleatorio2"


            val cartaAleatoria3 = valoresEnum.random()
            val numeroAleatorio3 = Random.nextInt(1, 11)

            carta3.text = "${cartaAleatoria3.name} $numeroAleatorio3"




            val cartaAleatoria4 = valoresEnum.random()
            val numeroAleatorio4 = Random.nextInt(1, 11)

            carta4.text = "${cartaAleatoria4.name} $numeroAleatorio4"
        }
    }
}
