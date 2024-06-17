package org.example.com.nygen

import org.example.com.nygen.data.User

fun main() {
    val contact = Contact(1, "tset@gmail.com")
    println(contact.id)
    println(contact.email)
    println("Id of the object is: ${contact.id}")

    contact.printId()

    val userOne = User("Alex",1)
    val userTwo = User("Alex", 1)
    val userThree = User("John", 2)

    val userOneString = userOne.toString()
    println(userOneString)
    println(userOne)

    //Comparing instances using ==
    println("userOne == userTwo : ${userOne == userTwo}")

    println("userOne == userThree: ${userOne == userThree}")
}