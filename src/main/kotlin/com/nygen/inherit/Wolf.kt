package com.nygen.inherit

class Wolf: Canine() {
    override val image = "wolf.jpg"

    override val food = "meat"

    override val habitat="forests"

    override fun makeNoise() {
        println("Hoowl!")
    }

    override fun eat() {
        println("Wolf is eating $food")
    }
}