package com.bedu_apk.tu_carrito_a.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bedu_apk.tu_carrito_a.R
import com.bedu_apk.tu_carrito_a.adapters.AdapterFarmacia
import com.bedu_apk.tu_carrito_a.adapters.ArticleAdapter1
import com.bedu_apk.tu_carrito_a.databinding.FragmentHomeBinding
import com.bedu_apk.tu_carrito_a.databinding.FragmentListaBinding
import com.bedu_apk.tu_carrito_a.models.ArticleModel1
import com.bedu_apk.tu_carrito_a.models.ListModel
import com.bedu_apk.tu_carrito_a.utilits.GridDecotarion


class ListaFragment : Fragment() {

    private lateinit var binding: FragmentListaBinding
    private lateinit var mAdapter: AdapterFarmacia
    private var listener: (ListModel) -> Unit = {}


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_lista, container, false)

        binding= FragmentListaBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpRecyclerView()
    }

    fun setListener(l: (ListModel) -> Unit) {
        listener = l
    }

    private fun getProducts(): MutableList<ListModel> {   //Se agrega
        val products: MutableList<ListModel> = ArrayList()

        products.add(ListModel("Parcetamol","Medicamentos","$50", 4.6f, R.drawable.paracetamol ) )
        products.add(ListModel("Biolectro", "Medicamentos", "$180", 4.4f, R.drawable.biolectro))
        products.add(ListModel("Suerox", "Medicamentos-Sueros", "$35", 4.8f, R.drawable.suerox))
        products.add(ListModel("Bedoyecta", "Vitaminas", "$150", 4.6f, R.drawable.bedoyecta))
        products.add(ListModel("Sinuberase", "Vitaminas", "$300", 4.8f, R.drawable.sin))
        products.add(ListModel("Histiacil", "STAR WARS The Black Series", "$180", 4.4f, R.drawable.histeasil))
        return products
    }

    private fun setUpRecyclerView() {
        binding.fragmentolista.setHasFixedSize(true)  //recyclerProducts  //nombre del id del recycle pero del xml
        binding.fragmentolista.layoutManager = LinearLayoutManager(context)
        //seteando el Adaptera
        mAdapter = AdapterFarmacia(requireActivity(), getProducts(), listener)   //Nombre del recycle adapter
        //asignando el Adapter al RecyclerView
        binding.fragmentolista.adapter = mAdapter
    }


}