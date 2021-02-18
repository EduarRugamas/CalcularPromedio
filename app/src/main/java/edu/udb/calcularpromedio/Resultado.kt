package edu.udb.calcularpromedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        //recibiendo los datos de la actividad principal
        val nombre:String = intent.getStringExtra("nombre").toString()
        val nota1 =  intent.getStringExtra("nota1").toString()
        val nota2 =  intent.getStringExtra("nota2").toString()
        val nota3 =  intent.getStringExtra("nota3").toString()
        val nota4 =  intent.getStringExtra("nota4").toString()

        //parseo de variable string a double
        val notaParseada1 = nota1.toDouble()
        val notaParseada2 = nota2.toDouble()
        val notaParseada3 = nota3.toDouble()
        val notaParseada4 = nota4.toDouble()

        notas1.text = notaParseada1.toString()
        notas2.text = notaParseada2.toString()
        notas3.text = notaParseada3.toString()
        notas4.text = notaParseada4.toString()


        val result = (notaParseada1 + notaParseada2 +   notaParseada3 +   notaParseada4) / 4


        //mostrar texto en la vista desde el codigo
        alumno.text = nombre
        resultado.text = result.toString()

            if (result <= 5){
                Aprovacion.text = "Tu nota es menor a 5 estas Reprobado"
            }else if(result > 5 && result <= 7 ){
                Aprovacion.text = "Tu nota es  Regular "
        }else if (result > 7 && result <= 10 ){
                Aprovacion.text = "Tu nota es Excelente"
                Mensaje.text = "Felicidades continua así"
            }
    }

}

