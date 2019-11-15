package com.wym.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wym.coderswag.Model.Product
import com.wym.coderswag.R


class ProductRecyclerAdapter(val context : Context, val products : List<Product>,val productClick : (Product)->Unit ) : RecyclerView.Adapter<ProductRecyclerAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
       val view : View = LayoutInflater.from(context).inflate(R.layout.list_product_item,parent,false)
        return Holder(view,productClick)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
       holder.bindProductView(context,products[position])

    }


  inner  class Holder(itemView: View, productClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val proImageView : ImageView = itemView.findViewById(R.id.pro_imgaeView)
        val proTitleView : TextView = itemView.findViewById(R.id.pro_titleView)
        val proPriceView : TextView = itemView.findViewById(R.id.pro_priceView)


        fun bindProductView (context: Context,product: Product){
            val resourceID = context.resources.getIdentifier(product.image,"drawable",context.packageName)
            proImageView.setImageResource(resourceID)
            proTitleView.text = product.title
            proPriceView.text = product.price
           itemView.setOnClickListener {productClick(product)  }



        }
    }
}