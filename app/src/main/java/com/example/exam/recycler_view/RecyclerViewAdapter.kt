package com.example.exam.recycler_view

import android.provider.ContactsContract.SyncState.get
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.R
import com.example.exam.data.ItemData
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_recycler.view.*
import kotlinx.android.synthetic.main.item_recycler.view.*

class RecyclerViewAdapter(private val listener: ItemListener):RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {
    private val list = arrayListOf<ItemData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler,parent,false)
        return RecyclerViewHolder(view)

    }
    fun update(list : List<ItemData>?){
        if (list!= null){
            this.list.clear()
            this.list.addAll(list)
            notifyDataSetChanged()
        }
    }
    override fun getItemCount() = list.size



    class RecyclerViewHolder(v : View) : RecyclerView.ViewHolder(v){
        fun bind(item: ItemData, listener: ItemListener){
          Picasso.get().load(item.image).into(itemView.img)
            itemView.tvList.text = item.name
        }
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(list[position],listener)
    }
}