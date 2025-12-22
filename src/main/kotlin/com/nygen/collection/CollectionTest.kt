package com.nygen.collection

fun main(args: Array<String>) {
    val shopping: List<String> = listOf("Tea","Eggs","Milk")

    if (shopping.size > 0) {
        println(shopping[0])
    }

    val mutableShopping = mutableListOf("Tea","Eggs")

    mutableShopping.add("Milk")

    mutableShopping.forEach { print(",$it") }

    mutableShopping.add(1,"Biscuit")

    mutableShopping.forEach { print(",$it") }
}