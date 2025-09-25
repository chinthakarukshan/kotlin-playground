package com.nygen.com

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var x = 1
    println("Before the loop x: $x")

    while(x<4) {
        println("In the loop x: $x")
        x=x+1
    }
    println("After the loop x: $x")
}