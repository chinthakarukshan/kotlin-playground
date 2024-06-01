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

}