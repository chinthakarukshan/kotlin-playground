package com.nygen.inherit

abstract class Animal {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    val hunger = 10

    open fun makeNoise() {
        println("The animal is making a noise")
    }

    open fun eat() {
        println("The animal is eating")
    }

    open fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }
}