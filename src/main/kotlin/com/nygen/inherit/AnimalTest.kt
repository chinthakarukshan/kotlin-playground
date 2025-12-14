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

    var wolf:Wolf? = Wolf()
    wolf = null
    var z = wolf!!.hunger
}

fun getAlphaWolf(alpha: Boolean): Wolf? {
    return if(alpha) Wolf() else null
}

class MyWolf() {
    var w: Wolf? = Wolf()

    fun printHunger() {
        w?.let {
            println(it.hunger)
        }
    }

    fun getHunger(): Int {
        return w?.hunger ?: -1
    }
}