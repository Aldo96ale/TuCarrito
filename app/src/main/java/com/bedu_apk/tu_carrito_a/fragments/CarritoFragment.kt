package com.bedu_apk.tu_carrito_a.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bedu_apk.tu_carrito_a.R



class CarritoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_carrito, container, false)
        val view=inflater.inflate(R.layout.fragment_carrito,container,false)
        return view
    }


}