package com.wym.coderswag.Services

import com.wym.coderswag.Adapters.ProductRecyclerAdapter
import com.wym.coderswag.Model.Category
import com.wym.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("HATS","hatimage"),
        Category("HOODIES","hoodieimage"),
        Category("SHIRTS","shirtimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat White","$18","hat3"),
        Product("Devslopes Hat Snapback","$22","hat4")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$18","hoodie1"),
        Product("Devslopes Hoodie Red","$20","hoodie2"),
        Product("Devslopes Gray Hoodie","$18","hoodie3"),
        Product("Devslopes Black Hoodie","$22","hoodie4")

    )
    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt1"),
        Product("Devslopes Badge Light Gray","$20","shirt2"),
        Product("Devslopes Logo Shirt Red","$18","shirt3"),
        Product("Devslopes Hustle","$22","shirt4"),
        Product("Kickflip Studios","$18","shirt5")

    )
    val digitals = listOf(
        Product("Devsopes Digital Product 1","$500","digitalgoodsimage"),
        Product("Devsopes Digital Product 2","$500","digitalgoodsimage"),
        Product("Devsopes Digital Product 3","$500","digitalgoodsimage"),
        Product("Devsopes Digital Product 4","$500","digitalgoodsimage")
    )

    fun getProducts (productType : String) : List<Product>{
        when(productType){
            "HATS" ->
                return hats
            "HOODIES" ->
                return hoodies
            "SHIRTS"->
                return shirts
            else ->
                return digitals
        }
    }
}