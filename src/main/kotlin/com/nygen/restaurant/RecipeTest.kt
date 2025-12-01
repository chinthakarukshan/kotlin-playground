package com.nygen.restaurant

fun main(args: Array<String>){
    var r1 = Recipe("Chicken Bhuna",false)
    val r2 = Recipe("Chicken Bhuna",false)

    if(r1==r2) {
        println("Two recipes are equal")
    }
    println(r1.toString())
    println(r2.toString())
}