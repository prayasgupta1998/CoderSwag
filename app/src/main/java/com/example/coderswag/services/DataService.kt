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
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$18", "hat02"),
            Product("Devslopes Hat White", "$18", "hat03"),
            Product("Devslopes Hat Snapback", "$18", "hat04")

    )
    // all the names for eg- shirtimage, hoodieimage, hat01, hat02 are coming from the names of the drawables.
    val hoodies = listOf(
            Product("Devslopes hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes hoodies Red", "$28", "hoodie02"),
            Product("Devslopes Gray hoodie", "$28", "hoodie03"),
            Product("Devslopes Black hoodie", "$28", "hoodie04")
    )


    val shirts = listOf(
            Product("Devslopes shirt Gray", "$18", "shirt01"),
            Product("Devslopes Badge light gray", "$20", "shirt02"),
            Product("Devslopes Logo shirt red", "$22", "shirt03"),
            Product("Devslopes Hustle", "$22", "shirt04"),
            Product("Kickflip studios", "$18", "shirt05")
    )


}