package org.example

import kotlin.math.PI

fun main() {
    val varOne:Int; //Variable declaration without initialization
    val name="Mary"
    val age=20

    print("$name is $age years old.")


    /*
    * Explicit declaraton of variables.
    * */
    val a:Int = 1000
    val b:String = "log message"
    val c:Double = 3.14
    val d:Long = 100_000_000_000_000
    val e:Boolean = false
    val f:Char = '\n'


    varOne = 300 // Initializing the variable

    kotlinLists()
    kotlinSets()
    kotlinMaps()
    kotlinCollectionExcercise()


    kotlinConditionalStatements()
    kotlinLoops()
    conditionalStatementAssignment()


    //Kotlin Methods

    println(sum(5,3))

    //Named arguments
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    printMessageWithPrefix(message = "Issue", prefix = "ERROR")
    printMessageWithPrefix("Request Received")
    println(sumShortened(5,7))
    println(circleArea(2))

}

fun kotlinLists() {
    // Read only list
    println()
    val readOnlyList = listOf("triangle", "square", "circle")
    println(readOnlyList)

    //Mutable list. Here the list type is inferred by the compiler
    val shapes = mutableListOf("triangle", "square", "circle")
    println(shapes)

    var animals: MutableList<String> = mutableListOf("Dog", "Cat", "Tiger") //List type is explicitly declared
    println(animals)

    animals.add("Lion");
    println(animals)

    println("The first animal in the list is ${animals[0]}")
    println("Animals array contains ${animals.count()} items")
    println("Lion" in animals) // Checks whether a given element exists in the list

    animals.remove("Lion")
    println("After removing lion from the list $animals")

}

fun kotlinSets() {
    val birdSet = setOf("Crow", "Parrot", "Piegon", "Piegon");
    println(birdSet)

    var mutableBirdSet : MutableSet<String> = mutableSetOf("Crow", "Parrot", "Piegon", "Piegon")
    println("Mutable Set $mutableBirdSet")

    println("Piegon" in birdSet)

    mutableBirdSet.add("Eagle")
    mutableBirdSet.remove("Crow")

    println("Set after modification $mutableBirdSet")
    println("Element count after modification ${mutableBirdSet.count()}")

}

fun kotlinMaps() {
    println("###### KOTLIN MAP ######")
    val priceMap:Map<String,Int> = mapOf("pumkin" to 200, "cabbage" to 400, "beans" to 100)
    val mutablePriceMap:MutableMap<String,Int> = mutableMapOf("pumkin" to 200, "cabbage" to 400, "beans" to 100)


    println(priceMap)
    println("Mutable price map $mutablePriceMap")
    println("Price of pumkin is ${mutablePriceMap["pumkin"]}")

    println("cabbage" in mutablePriceMap.keys) // Checks if the cabbage contains in the map keys
    println(120 in mutablePriceMap.values) // check if 120 contains in the map values

    println("Map has ${mutablePriceMap.count()}") // Prints the key value pair count

    mutablePriceMap.put("brinjal", 500)
    mutablePriceMap.remove("pumkin")

    println("Mutable map after modification $mutablePriceMap")
}

fun kotlinCollectionExcercise() {
    println("###### EXERCISE BEGINS ######")
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    println("Total Number Count : ${greenNumbers.count() + redNumbers.count()}")


    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "SMTP"
    val isSupported = requested.uppercase() in SUPPORTED// Write your code here
    println("Support for $requested: $isSupported")

    val number2word = mapOf(1 to "One", 2 to "Two", 3 to "Three")// Write your code here
    val n = 2
    println("$n is spelt as '${number2word[n]}'")


}

fun kotlinConditionalStatements() {
    var decisionVariable:Int
    val isCompleted:Boolean = false

    //If as a statement

    if (isCompleted) {
        decisionVariable = 2
    } else {
        decisionVariable = 3
    }

    println("Decision Variable : $decisionVariable")

    val a=1
    val b=3

    println(if(a > b) a else b ) // If as an expression


    //when as a statement

    val decisionString = "Hello"

    when(decisionString) {
        "1" -> println("Value One")
        "Hello" -> println("Value is Hello")
        else -> println("Didn't receive expected input")
    }


    //when as an expression

    val result = when(decisionString) {
        "1" -> "Value is One"
        "Hello" -> "Value is Hello"
        else -> "Unknown"
    }

    println("When expression result is $result")

    //When for boolean comparisons

    val temperature = 18

    val climate = when {
        temperature < 10 -> "Very Cold"
        10 <= temperature && 30> temperature -> "Mild"
        else -> "Hot"
    }

    println("Climate is $climate")
}

fun kotlinLoops() {

    val fruits:List<String> = listOf("Apple", "Mango", "Banana", "Pineapple")

    for (number in 1..5){
        println(number)
    }

    for(fruit in fruits) {
        println(fruit)
    }

    var count = 0
    var doCount = 0

    while (count < 3) {
        println("Count is $count")
        count++
    }

    do {
        println("Do Count $doCount")
        doCount++
    } while(doCount < count)


}

fun conditionalStatementAssignment () {
    val button="A"
    when(button) {
        "A" -> println("Yes")
        "B" -> println("No")
        "X" -> println("Menu")
        "Y" -> println("Nothing")
        else -> println("There is no such button")
    }


    //Pizza slices assignment

    var pizzaSlices=0
    pizzaSlices++

    while (pizzaSlices <= 8) {
        if (pizzaSlices == 8) {
            println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
        } else {
            println("There's only $pizzaSlices slice/s of pizza :(")
        }
        pizzaSlices++
    }

    //Pizza slices assignment-v2

    var pizzaSlices_V2=0
    while (pizzaSlices_V2 < 7) {
        println("There's only $pizzaSlices_V2 slice/s of pizza :(")
        pizzaSlices_V2++
    }

    pizzaSlices_V2++
    println("There are $pizzaSlices_V2 slices of pizza. Hooray! We have a whole pizza! :D")


    //pizza slices do-while

    var pizzaSliceCount=0

    pizzaSliceCount++

    do{
        println("There's only $pizzaSliceCount slice/s of pizza :(")
        pizzaSliceCount++
    } while(pizzaSliceCount<8)
    println("There are $pizzaSliceCount slices of pizza. Hooray! We have a whole pizza! :D")


    //fizz-buzz assignment
    fizzbuzz()


    //String check

    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for (word in words) {
        if(word.startsWith("l")) {
            println(word)
        }
    }
}

fun fizzbuzz() {
    for(number in 1..100) {
        when {
            (number%3==0 && number%5==0) -> println("fizzbuzz")
            number%3==0 -> println("fizz")
            number%5==0 -> println("buzz")
            else -> println(number)
        }
    }
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}

fun sumShortened(x: Int, y: Int) = x + y

fun circleArea(radius: Int): Double {
    return PI * radius * radius
}