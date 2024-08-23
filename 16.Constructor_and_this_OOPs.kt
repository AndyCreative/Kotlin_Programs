package org.example
//Simple Constructor

class Employee{
    constructor()
    {
        println("Employee constructor")
    }

}

//parameterized Constructor
class Student constructor(var sNo:Int,var sName:String,var sAge:Int)
{
    constructor():this(10,"kotlin",20)
    {
        println("Student constructor : $sNo, $sName, $sAge")
    }

    constructor(name:String,age:Int):this()
    {
        this.sName=name
        this.sAge=age
        println("Constructor :  $name ,$age,")
    }
}


fun main() {
    var employee = Employee()
    var student = Student()
    println(student.sName)
    var student2 = Student(15,"android",23)
    var student3=Student("abc",20)


}