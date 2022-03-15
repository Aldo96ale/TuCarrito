package com.bedu_apk.tu_carrito_a.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bedu_apk.tu_carrito_a.R
import com.bedu_apk.tu_carrito_a.databinding.FragmentDetailBinding
import com.bedu_apk.tu_carrito_a.models.ArticleModel1
import com.bedu_apk.tu_carrito_a.models.ArticleModel2


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_detail, container, false)
        binding= FragmentDetailBinding.inflate(layoutInflater)
        return binding.root

    }

    fun showProduct(product: ArticleModel1) {  //viene de la clase producto
        binding.detailView.visibility = View.VISIBLE  //viene del ID del datail del xml
        binding.tvProduct.text = product.name
        binding.tvDescription.text = product.description
        binding.rbRate.rating = product.rating
        binding.imgProduct.setImageResource(product.idImage)
        binding.tvPrice.text = product.price
    }
}