package com.bedu_apk.tu_carrito_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.util.PatternsCompat
import com.bedu_apk.tu_carrito_a.databinding.ActivityAddUserBinding
import com.bedu_apk.tu_carrito_a.databinding.ActivityNavigationBinding

class AddUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_user)

        binding = ActivityAddUserBinding.inflate(layoutInflater)  //Recuerda siempre inflar la vista
        setContentView(binding.root)

        binding.btnSingup.setOnClickListener {
            if (validationUser()) {
                if (validationEmail()) {
                    if (validationPassword()){
                        Toast.makeText(this, "Usuario Creado Exitosamente", Toast.LENGTH_SHORT).show()
                        val intent = Intent( this, NavigationActivity::class.java)
                        startActivity(intent)
                    }
                }
            }

        } //Evento click
    }


    private fun validationUser(): Boolean {
        val username = binding.txtUsername.editText?.text.toString()
        return if (username == "") {
            Toast.makeText(this, "El campo Usuario no puede estar vacio", Toast.LENGTH_SHORT).show()
            false
        } else
            true
    }


    private fun validationEmail(): Boolean {
        val email = binding.txtMail.editText?.text.toString().lowercase()
        return if (email == "") {
            Toast.makeText(this, "El campo Email no puede estar vacio", Toast.LENGTH_SHORT).show()
            false
        } else if (!PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Email Invalido", Toast.LENGTH_SHORT).show()
            false
        } else
            true
    }

    private fun validationPassword(): Boolean {
        val newpass = binding.txtNewpass.editText?.text.toString().lowercase()
        val confpass = binding.txtConfirmpass.editText?.text.toString().lowercase()

        return if (newpass == "") {
            Toast.makeText(this, "El campo Nueva Contraseña no puede estar vacio", Toast.LENGTH_SHORT).show()
            false
        } else if (confpass=="") {
            Toast.makeText(this, "El campo Confirmar Contraseña no puede estar vacio", Toast.LENGTH_SHORT).show()
            false
        } else if (newpass!=confpass){
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            false
        }
        else{
            true
        }

    }


}




