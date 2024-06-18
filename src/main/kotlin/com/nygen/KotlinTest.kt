package org.example.com.nygen

import org.example.com.nygen.data.Employee
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

    println(userOne.copy())
    println(userOne.copy("David"))
    println(userOne.copy(id = 4))

    //Exercise 01
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)

    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployeeSingleExpression())
}