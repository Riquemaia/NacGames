package br.com.fiap.nacgames

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.nacgames.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {

    lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btAdicionar.setOnClickListener(){
            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }
    }
}