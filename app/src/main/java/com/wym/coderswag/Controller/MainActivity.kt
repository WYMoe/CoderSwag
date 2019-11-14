package com.wym.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.ArrayAdapter
import android.widget.ExpandableListAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wym.coderswag.Adapters.CategoryAdapter
import com.wym.coderswag.Adapters.CategoryRecyclerAdapter
import com.wym.coderswag.Model.Category
import com.wym.coderswag.R
import com.wym.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

 lateinit var adapter:CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecyclerAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

       val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this)

        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)





    }
}
