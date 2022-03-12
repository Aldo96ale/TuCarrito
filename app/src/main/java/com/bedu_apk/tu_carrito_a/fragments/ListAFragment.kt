package com.bedu_apk.tu_carrito_a.fragments

/*import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.bedu_apk.tu_carrito_a.R
import com.bedu_apk.tu_carrito_a.adapters.ListAdapter
import com.bedu_apk.tu_carrito_a.databinding.FragmentHomeBinding
import com.bedu_apk.tu_carrito_a.databinding.FragmentListABinding
import com.bedu_apk.tu_carrito_a.models.ArticleModel1
import com.bedu_apk.tu_carrito_a.models.ListModel
import com.bedu_apk.tu_carrito_a.utilits.GridDecotarion

class ListAFragment : Fragment() {

    private lateinit var binding: FragmentListABinding

    private lateinit var mAdapter: ListAdapter //Nombre del adaptador del articulo 1
    private var listener: (ListModel) -> Unit = {}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_list_a, container, false)

        binding= FragmentListABinding.inflate(layoutInflater)

        return binding.root

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpRecyclerView()
    }

    fun setListener(la: (ListModel) -> Unit) {
        listener = la
    }

    private fun getProducts(): MutableList<ListModel> {   //Se agrega
        val product: MutableList<ListModel> = ArrayList()

        product.add(ListModel("Cerveza Victoria","Alimentos y bebidas","$200", 4.6f, R.drawable.cerveza_victoria ) )
        product.add(ListModel("Cerveza Clara Corona ", "Alimentos y bebidas", "$180", 4.4f, R.drawable.cerveza_modelo))
        product.add(ListModel("Cerveza Pacifco", "Alimentos y bebidas", "$160", 4.8f, R.drawable.cerveza_pacifico))
        product.add(ListModel("Cerveza en lata Victoria", "Alimentos y bebidas", "$160", 4.6f, R.drawable.cerveza_lata))
        product.add(ListModel("Modelo Extra Especial", "Alimentos y bebidas", "$300", 4.8f, R.drawable.cerveza_negraespecial))
        product.add(ListModel(" CervezaStella ", "Alimentos y bebidas", "$350", 4.4f, R.drawable.cerveza_estella))
        return product
    }*/

    /*private fun setUpRecyclerView() {
        binding.recyclerList.setHasFixedSize(true)  //recyclerProducts  //nombre del id del recycle pero del xml
        binding.recyclerList.layoutManager = GridLayoutManager(activity,1,
            GridLayoutManager.VERTICAL,false)
        val largePadding = resources.getDimensionPixelSize(R.dimen.product_grid_spacing)
        val smallPadding = resources.getDimensionPixelSize(R.dimen.product_grid_spacing_small)
        binding.recyclerList.addItemDecoration(GridDecotarion(largePadding, smallPadding))
        //seteando el Adaptera
        mAdapter = ListAdapter(requireActivity(), getProducts(), listener)   //Nombre del recycle adapter
        //asignando el Adapter al RecyclerView
        binding.recyclerList.adapter = mAdapter
    }



}*/