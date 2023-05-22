package com.example.parcialpdm_00087821

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText

class SecondFragment : Fragment() {
   private lateinit var editCountryName : EditText
   private lateinit var editPaisName: EditText
   private lateinit var buttonEnviar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_second)

        editCountryName = findViewById(R.id.editCountryName)
        editPaisName = findViewById(R.id.editNameCountry)
        buttonEnviar = findViewById(R.id.buttonEnviar)

        buttonEnviar.setOnClickListener {
            val Pais = intent.getStringExtra(¨Pais¨).toString()
            val Capital = intent.getStringExtra(¨Capital¨).toString()

            val intent = intent(this, fragment_principal::class: java){
                intent.putExtra(¨Pais¨, Pais)
                intent.putExtra(¨Capital¨, Capital)
                startActivity(intent)
            }
        }

    }


}