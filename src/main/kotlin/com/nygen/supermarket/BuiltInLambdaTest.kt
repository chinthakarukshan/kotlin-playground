package com.nygen.supermarket

fun main(args: Array<String>) {

    val ints = listOf(1,2,3,4)

    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb",3.0,11),
        Grocery("Bagels", "Bakery", "Packets", 1.5,5),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0,10),
        Grocery("Ice cream", "Frozen", "Pack", 3.0,3),
        Grocery("Mushroom", "Vegetable", "lb",4.0,1)
    )

    val highestUnitPrice = groceries.maxBy { it.unitPrice }
    println(highestUnitPrice)

    val lowestQuantity = groceries.minBy { it.quantity }
    println(lowestQuantity)

    val sumQuantity = groceries.sumOf { it.quantity }
    println(sumQuantity)

    val totalPrice = groceries.sumOf { it.unitPrice * it.quantity }
    println(totalPrice)

    val vegetables = groceries.filter { it.category == "Vegetable" }
    println(vegetables.size)

    val unitPriceOver3 = groceries.filter { it.unitPrice > 3.0 }
    println(unitPriceOver3.size)

    val intDoubles = ints.map { it * 2 }
    println(intDoubles)

    val groceryNames = groceries.map { it.name }
    println(groceryNames)

    val newPrices = groceries.filter { it.unitPrice > 3 }.map { it.unitPrice * 2 }
    println(newPrices)

    groceries.forEach { println(it.name) }

    var itemNames = ""
    groceries.forEach { itemNames += "${it.name} " }
    println(itemNames)

    groceries.groupBy { it.category }.forEach {
        println(it.key)
        it.value.forEach { println(it.name) }
    }

    val intList = listOf(1,3,5)
    val sum = intList.fold(0) {sumInts,item -> sumInts + item}
    println("Fold Results : $sum")

    val multiplicationResult = intList.fold(1){multiplyResults, item -> multiplyResults * item}
    println("Fold multiplication result: $multiplicationResult")

    val concatenatedGroceryNames = groceries.fold(""){concateString, item -> concateString + " ${item.name}"}
    println(concatenatedGroceryNames)

    val balance = groceries.fold(200.0) {tempBalance, groceryItem -> tempBalance - groceryItem.unitPrice * groceryItem.quantity}
    println("Balance payment: $balance")

    val vegetableCost = groceries.filter { it.category == "Vegetable" }.sumOf { it.unitPrice * it.quantity }
    println("Cost for vegetables: $vegetableCost")

    val lessThanFiveItems = groceries.filter { it.unitPrice * it.quantity < 5 }.map { it.name }
    println(lessThanFiveItems)

}