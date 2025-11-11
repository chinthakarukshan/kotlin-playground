package com.nygen.dog

class Dog(val name:String, var weight: Int,breed_param:String) {

    init {
        println("Dog constructor has run. But the breed property has not been initiated")
        println(breed_param)
    }

    val breed = breed_param.uppercase()

    init {
        println("Dog constructor has run. Breed property has initiated with the value of $breed")
    }
}