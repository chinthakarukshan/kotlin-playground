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

    println("cabbage" in mutablePriceMap.keys) // Checks if the cabbage contains in the map keys
    println(120 in mutablePriceMap.values) // check if 120 contains in the map values

    println("Map has ${mutablePriceMap.count()}") // Prints the key value pair count

    mutablePriceMap.put("brinjal", 500)
    mutablePriceMap.remove("pumkin")

    println("Mutable map after modification $mutablePriceMap")
}