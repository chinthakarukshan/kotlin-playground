package com.nygen.pet

fun main(args: Array<String>) {
    val catContest = Contest<Cat>()

    catContest.addScore(Cat("Rexy"), 45)
    catContest.addScore(Cat("Roy"),25)
    catContest.addScore(Cat("Joy"),35)

    val topCat = catContest.getWinners().first()
    println(topCat.name)

    val openContest = Contest<Pet>()

    openContest.addScore(Cat("Jim"),34)
    openContest.addScore(Dog("Rick"),24)
    openContest.addScore(Fish("Dolly"),23)

    println(openContest.getWinners().first().name)

    val catRetailer1 = CatRetailer()
    val catRetailer2: CatRetailer = CatRetailer()

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
}