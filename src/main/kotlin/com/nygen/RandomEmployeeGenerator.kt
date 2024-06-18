package org.example.com.nygen

import org.example.com.nygen.data.Employee

class RandomEmployeeGenerator(var minSalary:Int, var maxSalary:Int) {
    val employeeNames:List<String> = listOf("John","Paul","Sharya")

    fun generateEmployee(): Employee {
        val employeeName = employeeNames.random()
        val employeeSalary = (minSalary..maxSalary).random()

        val employee = Employee(employeeName,employeeSalary)

        return employee
    }

    fun generateEmployeeSingleExpression() = Employee(employeeNames.random(),(minSalary..maxSalary).random())
}