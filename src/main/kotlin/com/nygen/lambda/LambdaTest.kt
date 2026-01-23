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

    convertFive { it *1.8 + 32 }

    val farValue = getConversionLambda("CentigradeToFehrenheit")(5.0)
    println(farValue)
}

fun convert(x:Double, converter:(Double)->Double) : Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertFive(converter:(Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun getConversionLambda(str: String): (Double) -> Double {
    if (str=="CentigradeToFehrenheit") {
        return { it* 1.8 + 32 }
    } else if (str=="KgsToPounds") {
        return { it * 2.204623}
    } else if (str=="PoundsToUSTons") {
        return {it/2000.0}
    } else {
        return {it}
    }
}
