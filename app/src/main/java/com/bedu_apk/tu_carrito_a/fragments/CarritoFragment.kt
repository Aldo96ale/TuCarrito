package com.bedu_apk.tu_carrito_a.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.bedu_apk.tu_carrito_a.ListaActivity
import com.bedu_apk.tu_carrito_a.NavigationActivity
import com.bedu_apk.tu_carrito_a.R
import com.bedu_apk.tu_carrito_a.adapters.AdapterLista
import com.bedu_apk.tu_carrito_a.databinding.FragmentCarritoBinding
import com.bedu_apk.tu_carrito_a.models.SectionModel
import com.bedu_apk.tu_carrito_a.utilits.GridDecotarion


class CarritoFragment : Fragment() {

    private lateinit var binding: FragmentCarritoBinding

    private lateinit var mAdapter: AdapterLista //Nombre del adaptador del articulo 1
    private var listener: (SectionModel) -> Unit = {}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        binding= FragmentCarritoBinding.inflate(layoutInflater)
        
        binding.button9.setOnClickListener {
            Toast.makeText(context, "DIste click en farmacia", Toast.LENGTH_SHORT).show()

            val intent = Intent( context, ListaActivity::class.java)
            startActivity(intent)
        }


        return binding.root
    }








    
}