package com.example.parcialpdm_00087821

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout

class PrincipalFragment : Fragment() {
    private lateinit var editName
    private Lateinit var

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
}