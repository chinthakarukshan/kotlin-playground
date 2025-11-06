package com.nygen.test

class Dog(val name: String, var weight: Int, val breed: String) {
    fun bark() {
        print(if (weight<20) "Yip!" else "Woof")
    }
}