package com.pachesoft.segundapractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //En este caso se hace la inicialización al momento de declarar!
        //Por ello requiere que se indiqe el tipo entre los < >
        val btnLista=findViewById<Button>(R.id.btnLista)

    // btnLista.setOnClickListener{navigateToLista()}
    }

//    private fun navigateToLista() {
//
//        TODO("Not yet implemented")
//    }
}