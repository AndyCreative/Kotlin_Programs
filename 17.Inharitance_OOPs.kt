package org.example

//Inheritance
open class Person(name:String) {
    init {
        println("My name is $name")
    }
    fun Details(contactNo:Long)
    {
        println("My Contact is $contactNo")
    }
}
class Department(name:String,sirName:String): Person("kotlin"){
    init {
        println("My name is $name and sirname is $sirName")
    }
}



fun main() {
    var person = Person("Dmitry")
    person.Details(123456789)
    var department = Department("Raj","Khunt")
    println(department.Details(1234568))
}