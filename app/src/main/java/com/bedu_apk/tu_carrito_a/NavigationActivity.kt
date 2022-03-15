package com.bedu_apk.tu_carrito_a


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bedu_apk.tu_carrito_a.databinding.ActivityNavigationBinding
import com.bedu_apk.tu_carrito_a.fragments.CarritoFragment
import com.bedu_apk.tu_carrito_a.fragments.HomeFragment
import com.bedu_apk.tu_carrito_a.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationActivity : AppCompatActivity() {

    private val homeFragment= HomeFragment ()
    private val carritoFragment= CarritoFragment()
    private val profileFragment= ProfileFragment()

    private lateinit var binding: ActivityNavigationBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_navigation)
        binding= ActivityNavigationBinding.inflate(layoutInflater)  //Recuerda siempre inflar la vista
        setContentView(binding.root)    //Recuerda siempre inflar la vista
        //Carga la función de reemplazar

        replaceFragment(homeFragment)

        homeFragment.setListener {
            //val detailFragment = supportFragmentManager.findFragmentById(R.id.containerdetalle) as? DetailFragment
            val intent = Intent(this, DetalleActivity::class.java)
            intent.putExtra(DetalleActivity.PRODUCT,it)
            startActivity(intent)
        }
        
        homeFragment.setListener2 {
            Toast.makeText(this, "CLick", Toast.LENGTH_SHORT).show()
        }







        val navigation:BottomNavigationView=binding.bottomNav

        navigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.HomeFragment->replaceFragment(homeFragment)
                R.id.CarritoFragment->replaceFragment(carritoFragment)
                R.id.ProfileFragment->replaceFragment(profileFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment!=null){
            val transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, fragment)  //va el remplace
            transaction.commit()
        }
    }



}