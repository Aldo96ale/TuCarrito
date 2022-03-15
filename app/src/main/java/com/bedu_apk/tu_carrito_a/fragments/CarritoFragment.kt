package com.bedu_apk.tu_carrito_a.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
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


        return binding.root
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpRecyclerView()
    }

    fun setListener(les: (SectionModel) -> Unit) {
        listener = les
    }

    private fun getProducts(): MutableList<SectionModel> {   //Se agrega
        val product: MutableList<SectionModel> = ArrayList()

        product.add(SectionModel("Farmacia", R.drawable.farmacia ) )
        product.add(SectionModel("Abarrotes y Bebidas", R.drawable.abarrotes))
        product.add(SectionModel("Mascota", R.drawable.mascota))
        product.add(SectionModel("Hogar", R.drawable.hogar))
        product.add(SectionModel("Dispositivos electronicos",  R.drawable.electronicos))
        product.add(SectionModel("Moda y Belleza", R.drawable.belleza))
        product.add(SectionModel("Juguetes",  R.drawable.juguetes))
        product.add(SectionModel("Deportes", R.drawable.deportes))
        return product
    }

    private fun setUpRecyclerView() {
        binding.recyclesection.setHasFixedSize(true)  //recyclerProducts  //nombre del id del recycle pero del xml
        binding.recyclesection.layoutManager = GridLayoutManager(activity,2,
            GridLayoutManager.VERTICAL,false)
        val largePadding = resources.getDimensionPixelSize(R.dimen.product_grid_spacing)
        val smallPadding = resources.getDimensionPixelSize(R.dimen.product_grid_spacing_small)
        binding.recyclesection.addItemDecoration(GridDecotarion(largePadding, smallPadding))
        //seteando el Adaptera
        mAdapter = AdapterLista(requireActivity(), getProducts(), listener)   //Nombre del recycle adapter
        //asignando el Adapter al RecyclerView
        binding.recyclesection.adapter = mAdapter
    }
}