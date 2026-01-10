package com.nygen.pet

class FishRetailer: Retailer<Fish> {
    override fun sell(): Fish {
        println("Selling Fish")
        return Fish("")
    }
}