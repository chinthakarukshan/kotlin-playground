package com.nygen.inherit

import com.nygen.restaurant.printInt

fun main(args: Array<String>) {
   /* val wolf = Wolf()
    wolf.eat()
    wolf.makeNoise()
    wolf.roam()*/

    val animals: List<Animal> = listOf(Wolf(), Hippo())
    for (animal in animals) {
        animal.eat()
        animal.roam()
    }

    val vet = Vet()
    for (animal in animals) {
        vet.giveShot(animal)
    }

    val roamables = arrayOf(Hippo(), Vehicle(), Wolf())
    for(roamable in roamables) {
        roamable.roam()
        if(roamable is Animal) {
            roamable.eat()
        }
        when(roamable) {
            is Hippo -> roamable.eat()
            is Wolf -> roamable.makeNoise()
            else -> roamable.roam()

        }
    }

    var myWolf: MyWolf? = MyWolf()

    println(myWolf?.w?.hunger)

    myWolf?.printHunger()
    println(myWolf?.getHunger())

    var names = arrayOf("Nuhan","Tesandu",null)

    for (name in names) {
        name?.let {
            println(it)
        }
    }

    getAlphaWolf(true)?.let { println(it.eat()) }
    getAlphaWolf(false)?.let { println(it.eat())}

    myFunction("6")
    myFunction("Test this")

    try {
        setWorkRatePercentation(101)
    } catch (e: IllegalArgumentException) {
        println(e.printStackTrace())
    }

    var wolf:Wolf? = Wolf()
    wolf = null
    var z = wolf!!.hunger
}

fun getAlphaWolf(alpha: Boolean): Wolf? {
    return if(alpha) Wolf() else null
}

fun myFunction(str: String) {

    var result = try {str.toInt()} catch (e: Exception) {null}

    try {
        val number = str.toInt()
        println(number)
    } catch (e: NumberFormatException) {
        println("Bummer")
    }

    println("myFunction has ended")
}

fun setWorkRatePercentation(x:Int) {
    if (x !in 0..100) {
        throw IllegalArgumentException("Percentation is not in range for x: $x")
    }
}

class MyWolf() {
    var w: Wolf? = Wolf()

    fun printHunger() {
        w?.let {
            println(it.hunger)
        }
    }

    fun getHunger(): Int {
        val h = w?.hunger ?: throw AnimalException()
        return w?.hunger ?: -1
    }
}