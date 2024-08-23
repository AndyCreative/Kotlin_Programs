package org.example

fun main() {

    print("Enter First Number: ")
    var FirstNo = readLine()!!.toInt()     // !! = Null safety  , toInt() used for taking input in int type
    print("Enter Second Number: ")
    var SecondNo = readLine()!!.toInt()

    //Arithmetic Operation
    println("Addition of two number is : ${FirstNo + SecondNo}")
    println("Subtraction of two number is : ${FirstNo - SecondNo}")
    println("Multiplication of two number is : ${FirstNo * SecondNo}")
    println("Division of two number is : ${FirstNo / SecondNo}")
    println("ModuleUs of two number is : ${FirstNo % SecondNo}")



}