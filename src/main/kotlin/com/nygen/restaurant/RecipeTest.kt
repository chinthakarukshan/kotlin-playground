package com.nygen.restaurant

fun main(args: Array<String>) {
    var r1 = Recipe("Chicken Bhuna", false)
    val r2 = Recipe("Chicken Bhuna", false)

    if (r1 == r2) {
        println("Two recipes are equal")
    }
    println(r1.toString())
    println(r2.toString())

    var r3 = Recipe("Thai curry", false)
    var r4 = r3.copy(isVegetarian = false)

    println(r3.component1())

    val (title, isVegi) = r3
    println("$title $isVegi")
    println(if (r1 == r2) "Object equivalant" else "false")
    println(if (r1 === r2) "Object identical" else "objects are not identical")
    println("r1 hashcode: ${r1.hashCode()}")


    var r5 = Recipe("Thai curry", false)
    r5.mainIngredient = "Chicken"
    var r6 = Recipe("Thai curry", false)
    r6.mainIngredient = "Duck"

    println(r5==r6)

    var r7 = Recipe(title="Spaghetti Bolognese", isVegetarian = false, mainIngredient = "Beef")
    var r8 = Recipe(mainIngredient = "Beef", title = "Fried Rice", isVegetarian = false)

    var mushroom = Mushroom(true)

    println(addNumbers(3,2))
    println(addNumbers(3.6,7.8))

    var nullableMushroom: Mushroom? = Mushroom(true)

    nullableMushroom = null

    printInt(null)

    println(getResult(true))
}

fun findReceips(title:String = "",
                ingredient:String = "",
                isVegetarian: Boolean = false,
                difficulty:String = ""): Array<Recipe> {
    return arrayOf(Recipe(title,isVegetarian,ingredient,difficulty))
}

fun addNumbers(a: Int, b: Int): Int {
    return a+b
}

fun addNumbers(a: Double,b: Double): Double {
    return a+b
}

fun printInt(value: Int?) {
    println(value)
}

fun getResult(param: Boolean):Long? {
    if (param) {
        return null
    }
    return 6
}
