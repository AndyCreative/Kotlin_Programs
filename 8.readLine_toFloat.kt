package org.example

fun main() {
    println("Area Of Circle")
    print("Enter Radius of Circle:")
    var radius :String?= readLine()

    if(radius.equals(""))
    {
        println("Invalid Input")
    }
    var pi :Float= 3.14f
    var r :Float = radius!!.toFloat()
    print("Area of Circle is:${pi*r*r}")






}