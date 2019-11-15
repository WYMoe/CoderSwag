package com.wym.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.wym.coderswag.Constant.PRODUCT_EXTRA
import com.wym.coderswag.Model.Product
import com.wym.coderswag.R
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {
lateinit var productDetail : Product
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        productDetail = intent.getParcelableExtra(PRODUCT_EXTRA)


        val resourceID = this.resources.getIdentifier(productDetail.image,"drawable",this.packageName)

        detail_imgaeView.setImageResource(resourceID)
        detail_titleView.text = productDetail.title
        detail_priceView.text = productDetail.price

    }
}
