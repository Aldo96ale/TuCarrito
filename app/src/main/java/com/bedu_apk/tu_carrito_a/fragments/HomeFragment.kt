package com.bedu_apk.tu_carrito_a.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.bedu_apk.tu_carrito_a.ListaActivity
import com.bedu_apk.tu_carrito_a.R
import com.bedu_apk.tu_carrito_a.adapters.ArticleAdapter1
import com.bedu_apk.tu_carrito_a.adapters.ArticleAdapter2
import com.bedu_apk.tu_carrito_a.databinding.FragmentHomeBinding
import com.bedu_apk.tu_carrito_a.models.ArticleModel1
import com.bedu_apk.tu_carrito_a.models.ArticleModel2
import com.bedu_apk.tu_carrito_a.utilits.GridDecotarion


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var mAdapter: ArticleAdapter1 //Nombre del adaptador del articulo 1
    private var listener: (ArticleModel1) -> Unit = {}  //Nombre del modelo del articulo 1

    private lateinit var miAdapter: ArticleAdapter2 //Nombre del adaptador del articulo 2
    private var listener2: (ArticleModel2) -> Unit = {}  //Nombre del modelo del articulo 2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        binding= FragmentHomeBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpRecyclerView()
        setUpRecyclerView2()
    }

    fun setListener(l: (ArticleModel1) -> Unit) {
        listener = l
    }

    fun setListener2(lst: (ArticleModel2) -> Unit) {
        listener2 = lst
    }

    private fun getProducts(): MutableList<ArticleModel1> {   //Se agrega
        val products: MutableList<ArticleModel1> = ArrayList()

        products.add(ArticleModel1("Clone Commander Cody","STAR WARS The Black Series","$1400", 4.6f, R.drawable.swclonecody ) )
        products.add(ArticleModel1("Clone Trooper 501st Legion ", "STAR WARS The Black Series", "$980", 4.4f, R.drawable.swclone501))
        products.add(ArticleModel1("General Grievous", "STAR WARS The Black Series", "$1800", 4.8f, R.drawable.swgrivevous))
        products.add(ArticleModel1("The Mandalorian", "STAR WARS The Black Series", "$750", 4.6f, R.drawable.swmandalorian))
        products.add(ArticleModel1("The Bad Batch Special", "STAR WARS The Black Series", "$3000", 4.8f, R.drawable.swpackclones))
        products.add(ArticleModel1("Boba Fett", "STAR WARS The Black Series", "$1350", 4.4f, R.drawable.swbobafett))
        return products
    }

    private fun setUpRecyclerView() {
        binding.rArticle1.setHasFixedSize(true)  //recyclerProducts  //nombre del id del recycle pero del xml
        binding.rArticle1.layoutManager = GridLayoutManager(activity,2,
            GridLayoutManager.VERTICAL,false)
        val largePadding = resources.getDimensionPixelSize(R.dimen.product_grid_spacing)
        val smallPadding = resources.getDimensionPixelSize(R.dimen.product_grid_spacing_small)
        binding.rArticle1.addItemDecoration(GridDecotarion(largePadding, smallPadding))
        //seteando el Adaptera
        mAdapter = ArticleAdapter1(requireActivity(), getProducts(), listener)   //Nombre del recycle adapter
        //asignando el Adapter al RecyclerView
        binding.rArticle1.adapter = mAdapter
    }

    private fun getProductos(): MutableList<ArticleModel2> {   //Se agrega
        val products: MutableList<ArticleModel2> = ArrayList()

        products.add(ArticleModel2("Asus TUF Gaming, Core i5 10th Gen, FHD, GTX 1650, 8GB RAM, 512 SSD","Oficina y equipo de Computo","$24500", 4.6f, R.drawable.lapton_asusg ) )
        products.add(ArticleModel2("Dell Gaming G3 15 3500 Intel Core I5 8Gb 256Gb", "Oficina y equipo de Computo", "$23000", 4.4f, R.drawable.lapton_superdell))
        products.add(ArticleModel2("Dell Laptop G5 5510 15.6 Ci5 10a,Gen, 8GB RAM, 256GB SSD, Nvidia GTX 1650", "Oficina y equipo de Computo", "$35000", 4.8f, R.drawable.laptop_dellgamer))
        products.add(ArticleModel2("MSI Gaming Laptop Katana GF66 i7-11800H, NVIDIA GeForce RTX3050 ", "Oficina y equipo de Computo", "$28000", 4.6f, R.drawable.lapton_msi))
        products.add(ArticleModel2("ASU TUF Gaming, Core i5 11th Gen, FHD, RTX 3050, 8GB RAM, 512 SSD", "Oficina y equipo de Computo", "$27500", 4.8f, R.drawable.lapton_asust))
        products.add(ArticleModel2("Notebook VICTUS 16 Core i5-11400H 8GB NVIDIA GeForce RTX™ 3050 4GB 512GB+32GB", "Oficina y equipo de Computo", "$27500", 4.8f, R.drawable.lapton_victus))
        return products
    }

    private fun setUpRecyclerView2() {
        binding.rArticle2.setHasFixedSize(true)  //recyclerProducts  //nombre del id del recycle pero del xml
        binding.rArticle2.layoutManager = GridLayoutManager(activity,1, GridLayoutManager.HORIZONTAL,false)
        val largePadding = resources.getDimensionPixelSize(R.dimen.product_grid_spacing)
        val smallPadding = resources.getDimensionPixelSize(R.dimen.product_grid_spacing_small)
        binding.rArticle2.addItemDecoration(GridDecotarion(largePadding, smallPadding))
        //seteando el Adaptera
        miAdapter = ArticleAdapter2(requireActivity(), getProductos(), listener2)   //Nombre del recycle adapter
        //asignando el Adapter al RecyclerView
        binding.rArticle2.adapter = miAdapter
    }


}