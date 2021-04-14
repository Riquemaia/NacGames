package br.com.fiap.nacgames.data

import br.com.fiap.nacgames.R
import br.com.fiap.nacgames.model.Jogo

class DataSource {

    fun carregarJogos(): List<Jogo>{
        return listOf<Jogo>(
            Jogo(R.drawable.counter_strike, R.string.counter_strike, R.string.produtoraCS, R.string.PlatafomaPC, R.string.Nota10),
            Jogo(R.drawable.valorant, R.string.valorant,R.string.produtoraVa,  R.string.PlatafomaPC, R.string.Nota8),
            Jogo(R.drawable.rocket, R.string.rocket,R.string.produtoraRL,  R.string.PlatafomaPC, R.string.Nota9)
        )
    }
}