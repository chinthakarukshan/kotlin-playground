package com.nygen.songs

fun main(args: Array<String>) {
    val songOne = Song("The mesopotamians","They might be giants")
    val songTwo = Song("Mathakayan Obe","Chamara Weerasinghe")
    val songThree = Song("Ananthayata yanawamai","Senaka Batagoda")

    songOne.play()
    songTwo.play()
    songTwo.stop()
    songThree.play()
}