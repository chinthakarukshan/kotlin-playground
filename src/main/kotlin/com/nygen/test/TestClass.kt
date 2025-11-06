package com.nygen.test

fun main(args: Array<String>) {
    var myDog = Dog("Fido",70,"Mixed")
    println(myDog.name)
    myDog.weight=50
    myDog.bark()
}