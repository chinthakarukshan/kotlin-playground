package com.nygen.inherit

interface Roamable {
    val velocity:Int

    fun roam()

    fun romable() {
        println("Concrete implementation of method")
    }
}