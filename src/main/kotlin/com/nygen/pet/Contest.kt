package com.nygen.pet

class Contest<T: Pet> {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score:Int) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T> {
        val maxScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()
        for((key,value) in scores) {
            if (value == maxScore) {
                winners.add(key)
            }
        }

        return winners
    }
}