package br.com.fiap.nacgames

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.nacgames.adapter.ItemAdapter
import br.com.fiap.nacgames.data.DataSource
import br.com.fiap.nacgames.databinding.ActivityListaBinding


class ListaActivity : AppCompatActivity() {

    lateinit var binding: ActivityListaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListaBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val dataset = DataSource().carregarJogos()
        binding.recyclerListaJogos.adapter = ItemAdapter(this, dataset)

        binding.addJogo.setOnClickListener(){
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}