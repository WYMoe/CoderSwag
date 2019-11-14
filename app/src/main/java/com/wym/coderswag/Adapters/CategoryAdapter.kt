package com.wym.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.wym.coderswag.Model.Category
import com.wym.coderswag.R
import com.wym.coderswag.Services.DataService
import com.wym.coderswag.Services.DataService.categories
import java.util.zip.Inflater

class CategoryAdapter(context: Context, categories: List<Category> ) : BaseAdapter() {
    val context  = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {



        val categoryView: View
        val holder : ViewHolder

        if (convertView == null){

            categoryView = LayoutInflater.from(context).inflate(R.layout.list_view_item,null)
            holder = ViewHolder()
            holder.catImageView = categoryView.findViewById(R.id.catImageView)
            holder.catTextView = categoryView.findViewById(R.id.catTextView)
            categoryView.tag = holder

        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }


        val category : Category = categories[position]
        holder.catTextView?.text = category.title

        val resourceID = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.catImageView?.setImageResource(resourceID)
        return  categoryView
    }

    override fun getItem(position: Int): Any {
      return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return  0

    }

    override fun getCount(): Int {
        return categories.count()
    }
    private class ViewHolder {
        var catImageView: ImageView? = null
        var catTextView: TextView? = null
    }
}