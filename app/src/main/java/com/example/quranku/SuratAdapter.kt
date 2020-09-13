package com.example.quranku

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quranku.model.Surat
import kotlinx.android.synthetic.main.item_row_quran.view.*

class SuratAdapter(val data: List<Surat>?) : RecyclerView.Adapter<SuratAdapter.MyHolder>() {


    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(get: Surat?){
            itemView.tv_surat.text = get?.nama
            itemView.tv_arab.text = get?.arab
            itemView.tv_arti.text = get?.arti
            itemView.tv_ayat.text = get?.ayat.toString()
            itemView.tv_type.text = get?.type
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val mView = LayoutInflater.from(parent.context).inflate(R.layout.item_row_quran, parent, false)
        return MyHolder(mView)
    }

    override fun getItemCount(): Int = data?.size ?: 0

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(data?.get(position))
    }


}