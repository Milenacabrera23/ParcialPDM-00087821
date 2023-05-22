package com.example.parcialpdm_00087821

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

// TODO: Rename parameter arguments, choose names that match
private const val Button = "Listbutton"
private const val  = "param2"

class SecondFragment : Fragment() {
    private lateinit var Button: Button
    private lateinit var editNameCountry: Text
    private lateinit var editCapitalCountry: Text
    private lateinit var textPais : TextView
    private lateinit var textCapital : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_second)

        textCapital  = findViewbyId(R.id.textCapital)
        textPais = findViewbyId(R.id.textPais)

        val intent = intent
        val Pais = intent.getStringExtra(¨Pais¨).toString()
        val Capital = intent.getStringExtra(¨Capital¨).toString()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}