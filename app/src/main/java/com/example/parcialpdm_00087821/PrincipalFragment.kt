package com.example.parcialpdm_00087821

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class PrincipalFragment : Fragment() {
    private lateinit var editName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_principal)
        bind()

        val adapterCountry = CountryAdapter()
        adapterCountry.setData(Country)

        val adapterCapital = CapitalAdapter()
        adapterCapital.setData(Country)

        recyclerView.adapterCapital = adapterCapital
        recyclerView.adapterCountry = adapterCountry
        recycleView.layoutManager = ConstraintLayout(this)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_principal, container, false)
    }

    companion object {
        fun newInstance(param1: String, param2: String) =
            PrincipalFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}