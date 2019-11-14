package com.wym.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ExpandableListAdapter
import android.widget.Toast
import com.wym.coderswag.Adapters.CategoryAdapter
import com.wym.coderswag.Model.Category
import com.wym.coderswag.R
import com.wym.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

 lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

        categoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this,"You clicked ${category.title} cell",Toast.LENGTH_SHORT).show()
        }



    }
}
