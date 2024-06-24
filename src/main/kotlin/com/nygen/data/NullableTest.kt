package org.example.com.nygen.data

fun main() {
    var neverNull: String = "This cannot be null"

    //This cannot never be null. Compilation error
    //neverNull = null

    var nullable:String?="This can be nullable"

    nullable=null

    var inferredNonNull = "Inferred value. compiler doesn't allow assigning null"

    //Compilation error. Doesn't allow null
    //inferredNonNull=null

    fun strLength(notNull:String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
    //println(strLength(nullable)) //Compilation error. Method doesn't accept nullable values

    println(describeSomething(nullable))

    println(lengthStringSafe(nullable))
    println(lengthStringSafe(neverNull))

    println(nullable?.length)

    println(nullable?.length ?: 0)

}

fun describeSomething(mayBeString:String?): String {
    if (mayBeString != null && mayBeString.length > 0) {
        return "String of length ${mayBeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun lengthStringSafe(mayBeString: String?): Int? = mayBeString?.length