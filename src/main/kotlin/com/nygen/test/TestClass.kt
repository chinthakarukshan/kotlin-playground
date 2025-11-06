package com.nygen.test

fun main(args: Array<String>) {
    var myDog = Dog("Fido",70,"Mixed")
    println(myDog.name)
    myDog.weight=50
    myDog.bark()

    var dogs = arrayOf(Dog("Rocky",27,"Mixed"), Dog("Bunty",24,"Labrador"))
    dogs[1].weight=15
    dogs[1].bark()

    dogs.forEach { it -> it.bark() }
}