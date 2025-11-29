package com.nygen.inherit

class Vehicle: Roamable {
    override val velocity: Int
        get() = 20

    override fun roam() {
        println("The vehicle is roaming")
    }

}