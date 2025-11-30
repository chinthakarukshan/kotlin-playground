package com.nygen.inherit

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


}