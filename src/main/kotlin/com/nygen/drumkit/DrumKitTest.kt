package com.nygen.drumkit

fun main(args: Array<String>){
    var myDrum = DrumKit(true,true)
    myDrum.playTopHat()
    myDrum.playSnare()
    myDrum.hasSnare=false
    myDrum.playTopHat()
    myDrum.playSnare()
}