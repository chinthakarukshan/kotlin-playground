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

    if(mutableShopping.contains("Biscuit")) {
        mutableShopping.remove("Biscuit")
    }
    println()

    mutableShopping.forEach { print(",$it") }

    if (mutableShopping.size > 0) {
        mutableShopping.set(0,"Coffee")
    }
    println()
    mutableShopping.forEach { print(",$it") }

    mutableShopping.sort()
    println()
    mutableShopping.forEach { print(",$it") }

    mutableShopping.reverse()
    println()
    mutableShopping.forEach { print(",$it") }

}