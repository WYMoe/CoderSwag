package com.wym.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.wym.coderswag.Adapters.ProductRecyclerAdapter
import com.wym.coderswag.Constant.PRODUCT_EXTRA
import com.wym.coderswag.Model.Product
import com.wym.coderswag.R
import com.wym.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
lateinit var adapter: ProductRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val productType = intent.getStringExtra(PRODUCT_EXTRA)
        val productList: List<Product> = DataService.getProducts(productType)

        adapter = ProductRecyclerAdapter(this,productList){product ->

            val detailIntent = Intent(this,ProductDetailActivity::class.java)
            detailIntent.putExtra(PRODUCT_EXTRA,product)
            startActivity(detailIntent)

        }

        productListView.adapter = adapter

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val gridLayoutManager = GridLayoutManager(this,spanCount)
        productListView.layoutManager = gridLayoutManager
        productListView.setHasFixedSize(true)


    }
}
