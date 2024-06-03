package org.example

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