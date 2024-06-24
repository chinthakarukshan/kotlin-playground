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



}