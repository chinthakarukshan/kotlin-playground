package com.nygen.restaurant

fun main(args: Array<String>) {
    var r1 = Recipe("Chicken Bhuna", false)
    val r2 = Recipe("Chicken Bhuna", false)

    if (r1 == r2) {
        println("Two recipes are equal")
    }
    println(r1.toString())
    println(r2.toString())

    var r3 = Recipe("Thai curry", false)
    var r4 = r3.copy(isVegetarian = false)

    println(r3.component1())

    val (title, isVegi) = r3
    println("$title $isVegi")
    println(if (r1 == r2) "Object equivalant" else "false")
    println(if (r1 === r2) "Object identical" else "objects are not identical")
    println("r1 hashcode: ${r1.hashCode()}")
}