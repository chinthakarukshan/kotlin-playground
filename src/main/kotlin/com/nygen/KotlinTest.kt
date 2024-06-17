package org.example.com.nygen

import org.example.com.nygen.data.User

fun main() {
    val contact = Contact(1, "tset@gmail.com")
    println(contact.id)
    println(contact.email)
    println("Id of the object is: ${contact.id}")

    val userOne = User("Alex",1)

    val userOneString = userOne.toString()
    println(userOneString)
    println(userOne)
}