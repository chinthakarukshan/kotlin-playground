package com.nygen.pet

fun main(args: Array<String>) {
    val catContest = Contest<Cat>()

    catContest.addScore(Cat("Rexy"), 45)
    catContest.addScore(Cat("Roy"),25)
    catContest.addScore(Cat("Joy"),35)

    val topCat = catContest.getWinners().first()
}