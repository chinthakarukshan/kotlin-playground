package com.nygen.supermarket

fun main (args: Array<String>) {
    val groceries = listOf<Grocery>(
        Grocery("Tomatoes", "Vegetable", "lb",3.0,1),
        Grocery("Bagels", "Bakery", "Packets", 1.5,1),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0,1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0,1)
    )
    println("Expensive Ingredients")
    search(groceries) {i: Grocery -> i.unitPrice > 5}
    println("All Vegetables")
    search(groceries) {i: Grocery -> i.category == "Vegetable"}
    println("All Packs")
    search(groceries) {i: Grocery -> i.unit == "Pack"}
}

fun search(list: List<Grocery>, criteria: (g: Grocery) -> Boolean) {
    for (l in list) {
        if(criteria(l)) {
            println(l.name)
        }
    }
}