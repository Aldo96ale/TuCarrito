package com.bedu_apk.tu_carrito_a.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bedu_apk.tu_carrito_a.R
import com.bedu_apk.tu_carrito_a.models.ArticleModel2

class ArticleAdapter2 (
    private val context: Context,
    private val products: MutableList<ArticleModel2>, //ESTE PRODUCTO DEBE DE TENER EL MISMO NOMBRE QUE LA CLASE DEL MODELO
    private val clickListener: (ArticleModel2) -> Unit  //modificar
) : RecyclerView.Adapter<ArticleAdapter2.ViewHolder>()  {   //modificar ponerle el mismo nombre del adaptador

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.bind(product, context)

        holder.view.setOnClickListener { clickListener(product) }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_article2, parent, false))  //Poner el item
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        //obteniendo las referencias a las Views
        val productName = view.findViewById(R.id.tvProduct) as TextView
        val description = view.findViewById(R.id.tvDescription) as TextView
        val price = view.findViewById(R.id.tvPrice) as TextView
        val image = view.findViewById(R.id.imgProduct) as ImageView

        //"atando" los datos a las Views
        fun bind(product: ArticleModel2, context: Context) {  //Nombre del modelo
            productName.text = product.name
            description.text = product.description
            price.text = product.price
            image.setImageResource(product.idImage)
        }
    }
}