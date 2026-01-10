package com.nygen.pet

class DogRetailer: Retailer<Dog> {
    override fun sell(): Dog {
        println("Selling dogs")
        return Dog("")
    }
}