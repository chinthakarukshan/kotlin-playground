package com.nygen.pet

interface Retailer<out T> {

    fun sell():T
}