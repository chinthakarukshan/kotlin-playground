package com.nygen.lambda

fun main(args: Array<String>) {
    val addInts = {x: Int, y: Int -> x+y}

    val addFive = {x:Int -> x+5}

    val result1 = addInts.invoke(4,6)
    println(result1)

    val result2 = addInts(6,8)
    println(result2)

    val addition: (Int,Int) -> Int
    addition = {a:Int,b:Int -> a+b}
    println(addition(9,8))

    val greeting: () -> String
    greeting = {"Hello!"}
    println(greeting())

    val addTen : (Int) -> Int = {it+10}
    println(addTen(7))

    val myLambda: () -> Unit = {println("Hi!")}
    myLambda()

    convert(20.0,{c:Double -> c*1.8 +32})
    val farenhite = convert(20.0){c:Double -> c*1.8 +32}
}

fun convert(x:Double, converter:(Double)->Double) : Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}
