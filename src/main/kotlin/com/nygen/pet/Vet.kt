package com.nygen.pet

class Vet<in T: Pet> {
    fun treat(t: T) {
        println("Treat pet ${t.name}")
    }
}