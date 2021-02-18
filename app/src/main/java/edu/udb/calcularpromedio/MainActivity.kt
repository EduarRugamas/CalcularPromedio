package edu.udb.calcularpromedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Calcular.setOnClickListener {

            val nombre = editNombre.text.toString()
            val nota1 = nota_1.text.toString()
            val nota2 = nota_2.text.toString()
            val nota3 = nota_3.text.toString()
            val nota4 = nota_4.text.toString()


            val intent = Intent(this, Resultado::class.java).apply {
                putExtra("nombre",nombre)
                putExtra("nota1", nota1)
                putExtra("nota2", nota2)
                putExtra("nota3", nota3)
                putExtra("nota4", nota4)
            }
            startActivity(intent)
        }


    }
}