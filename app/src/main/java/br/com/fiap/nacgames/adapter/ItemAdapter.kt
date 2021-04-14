package br.com.fiap.nacgames.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.nacgames.R
import br.com.fiap.nacgames.model.Jogo

class ItemAdapter (val context: Context, val dataset: List<Jogo>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    inner class ItemViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.itemImagemJogo)
        val txtNome: TextView = view.findViewById(R.id.itemNome)
        val txtNota: TextView = view.findViewById(R.id.itemNota)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.txtNome.text = context.resources.getString(item.NomeRid)
        holder.txtNota.text = context.resources.getString(item.NotaRid)

    }

}