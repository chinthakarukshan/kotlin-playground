package org.example.com.nygen.data

fun main() {
    var neverNull: String = "This cannot be null"

    //This cannot never be null. Compilation error
    //neverNull = null

    var nullable:String?="This can be nullable"

    nullable=null


}