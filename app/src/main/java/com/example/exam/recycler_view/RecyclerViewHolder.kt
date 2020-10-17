package com.example.exam.recycler_view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.data.ItemData
import kotlinx.android.synthetic.main.item_recycler.view.*

class RecyclerViewHolder(view: View): RecyclerView.ViewHolder(view){
    fun bind(
        itemData: ItemData,
        listener: ItemListener
    ){
        itemView.textView2.text = itemData.name
        itemView.setOnClickListener {
            listener.itemsClick(itemData)
        }

    }
}