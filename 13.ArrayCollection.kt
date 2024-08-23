package org.example

fun main() {
    var arr=ArrayList<String>()
    arr.add("one")
    arr.add("two")
    arr.add(0,"three")   //Add With index
    arr.add("four")
    arr.add("five")
    println(arr)

    var NewArray=arr.toArray()
    println()

    println(arr.contains("three"))  //output in boolean
    arr.remove("three")
    println(arr)
    println(arr.contains("three"))
    arr.set(2,"Prins")              //Replace Element With Index using "set" function
    println(arr)
}