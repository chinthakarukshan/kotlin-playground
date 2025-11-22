package com.nygen.inherit

class Hippo: Animal() {
    override val image = "hippo.jpg"

    override val food = "grass"

    override val habitat = "water"

    override fun makeNoise() {
        println("Grut! Grut!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }
}