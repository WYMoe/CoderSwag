package com.wym.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wym.coderswag.Model.Category
import com.wym.coderswag.R

class CategoryRecyclerAdapter(val context : Context, val categories : List<Category>) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
      val view = LayoutInflater.from(context).inflate(R.layout.list_view_item,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
     return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.bindCategory(context,categories[position])
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val catImageView : ImageView = itemView.findViewById(R.id.catImageView)
        val catTextView : TextView = itemView.findViewById(R.id.catTextView)

        fun bindCategory(context: Context,category: Category){
            val resourceID = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            catImageView.setImageResource(resourceID)
            catTextView.text = category.title
        }


    }
}