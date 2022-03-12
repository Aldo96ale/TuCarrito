package com.bedu_apk.tu_carrito_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bedu_apk.tu_carrito_a.databinding.ActivityDetalleBinding
import com.bedu_apk.tu_carrito_a.databinding.ActivityMainBinding
import com.bedu_apk.tu_carrito_a.fragments.Detail2Fragment
import com.bedu_apk.tu_carrito_a.fragments.DetailFragment
import com.bedu_apk.tu_carrito_a.models.ArticleModel1
import com.bedu_apk.tu_carrito_a.models.ArticleModel2

class DetalleActivity : AppCompatActivity() {

    companion object {
        const val PRODUCT = "PRODUCT"   //se cambia a const
        // const val PRODUCT2 = "PRODUCT"   //se cambia a const
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        val product = intent.getParcelableExtra<ArticleModel1>(PRODUCT)
        val detailFragment= supportFragmentManager.findFragmentById(R.id.containerdetalle) as? DetailFragment
        if(product != null){
            detailFragment?.showProduct(product)
        }

        /*val producto = intent.getParcelableExtra<ArticleModel2>(PRODUCT)
        val detailFragmento= supportFragmentManager.findFragmentById(R.id.containerdetalle2) as? Detail2Fragment
        if(producto != null){
            detailFragmento?.showProducto(producto)
        }*/
    }

}