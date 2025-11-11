package com.nygen.dog

class Dog(val name:String, var weight: Int,breed_param:String) {

    val breed = breed_param.uppercase()
}