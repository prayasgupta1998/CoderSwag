package com.example.coderswag.services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$18", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$18", "hat4")

    )
    // all the names for eg- shirtimage, hoodieimage, hat01, hat02 are coming from the names of the drawables.
    val hoodies = listOf(
            Product("Devslopes hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes hoodies Red", "$28", "hoodie2"),
            Product("Devslopes Gray hoodie", "$28", "hoodie3"),
            Product("Devslopes Black hoodie", "$28", "hoodie4")
    )


    val shirts = listOf(
            Product("Devslopes shirt Gray", "$18", "shirt1"),
            Product("Devslopes Badge light gray", "$20", "shirt2"),
            Product("Devslopes Logo shirt red", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Kickflip studios", "$18", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }


}