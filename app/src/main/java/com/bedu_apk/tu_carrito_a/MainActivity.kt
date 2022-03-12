package com.bedu_apk.tu_carrito_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bedu_apk.tu_carrito_a.databinding.ActivityMainBinding
import com.bedu_apk.tu_carrito_a.models.UserModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val listUserSingIn = listOf(
        UserModel("aldo.cortes", "talma"),
        UserModel("juan.sanchez", "TalmaA4$$"),
        UserModel("jaziel.gonzalez", "TalmaA3$$"),
        UserModel("laura.iturria", "TalmaA2$$"),
        UserModel("angel.zavala", "TalmaA1$$"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {

            val username=binding.User.editText?.text.toString().lowercase()
            val password=binding.Pass.editText?.text.toString()

            val search = listOf(UserModel(username, password))
            val searching = listUserSingIn.containsAll(search)

            if (searching){
                Toast.makeText(this, "Welcome ${username}", Toast.LENGTH_LONG).show()
                val intent = Intent( this, NavigationActivity::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(this, "Invalid user or password", Toast.LENGTH_SHORT).show()


        }

        binding.txvRegister.setOnClickListener {
            val intent=Intent(this,AddUserActivity::class.java)
            startActivity(intent)
        }
    }
}