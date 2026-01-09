package com.nygen.pet

class Contest<T: Pet> {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score:Int) {
        if (score >= 0) scores.put(t, score)
    }
}