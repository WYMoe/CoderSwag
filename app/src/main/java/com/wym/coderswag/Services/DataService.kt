package com.wym.coderswag.Services

import com.wym.coderswag.Model.Category
import com.wym.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("HATS","hatimage"),
        Category("HOODIES","hoodieimage"),
        Category("SHIRTS","shirtimage"),
        Category("DIGITAL","digitalgoodsimgae")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat01"),
        Product("Devslopes Hat Black","$20","hat02"),
        Product("Devslopes Hat White","$18","hat03"),
        Product("Devslopes Hat Snapback","$22","hat04")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$18","hoodie01"),
        Product("Devslopes Hoodie Red","$20","hoodie02"),
        Product("Devslopes Gray Hoodie","$18","hoodie03"),
        Product("Devslopes Black Hoodie","$22","hoodie04")

    )
    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt01"),
        Product("Devslopes Badge Light Gray","$20","shirt02"),
        Product("Devslopes Logo Shirt Red","$18","shirt03"),
        Product("Devslopes Hustle","$22","shirt04"),
        Product("Kickflip Studios","$18","shirt05")

    )
}