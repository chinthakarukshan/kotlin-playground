package com.nygen.pet

class Contest<T: Pet> {
    val scores: MutableMap<T, Int> = mutableMapOf()
}