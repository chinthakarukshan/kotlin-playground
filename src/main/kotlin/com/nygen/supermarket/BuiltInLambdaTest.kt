package com.nygen.supermarket

fun main(args: Array<String>) {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb",3.0,11),
        Grocery("Bagels", "Bakery", "Packets", 1.5,5),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0,10),
        Grocery("Ice cream", "Frozen", "Pack", 3.0,3),
        Grocery("Mushroom", "Vegetable", "lb",4.0,2)
    )

    val highestUnitPrice = groceries.maxBy { it.unitPrice }
    println(highestUnitPrice)

    val lowestQuantity = groceries.minBy { it.quantity }
    println(lowestQuantity)

    val sumQuantity = groceries.sumOf { it.quantity }
    println(sumQuantity)

    val totalPrice = groceries.sumOf { it.unitPrice * it.quantity }
    println(totalPrice)
}