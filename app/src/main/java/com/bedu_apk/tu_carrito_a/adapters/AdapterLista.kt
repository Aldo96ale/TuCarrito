package com.bedu_apk.tu_carrito_a.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bedu_apk.tu_carrito_a.R
import com.bedu_apk.tu_carrito_a.models.ArticleModel1
import com.bedu_apk.tu_carrito_a.models.SectionModel

class AdapterLista (
    private val context: Context,
    private val products: MutableList<SectionModel>, //ESTE PRODUCTO DEBE DE TENER EL MISMO NOMBRE QUE LA CLASE DEL MODELO
    private val clickListener: (SectionModel) -> Unit  //modificar
) : RecyclerView.Adapter<AdapterLista.ViewHolder>()  {   //modificar ponerle el mismo nombre del adaptador



    override fun onBindViewHolder(holder: AdapterLista.ViewHolder, position: Int) {
        val product = products.get(position)
        holder.bind(product, context)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_section, parent, false))
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        //obteniendo las referencias a las Views
        val nameSection = view.findViewById(R.id.idSection) as TextView
        val image = view.findViewById(R.id.imgSection) as ImageView

        //"atando" los datos a las Views
        fun bind(product: SectionModel, context: Context) {  //Nombre del modelo
            nameSection.text = product.section
            image.setImageResource(product.idImage)

            itemView.setOnClickListener {
                Toast.makeText(context, "Diste click en el item ${product.section}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}