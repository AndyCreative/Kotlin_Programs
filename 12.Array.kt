package org.example

fun main() {
    var Arr=Array<Int>(5){0}
    var Arr2= arrayOf(2,4,6,8,7)
    var Arr3= arrayOf<Int>(3,4,6,8,9)                       //For Only Integer
    var Arr4= arrayOf<String>("abc","MCA","Sem-3")      //For Only String Type
    var Arr5= arrayOf(1,2,"One","Two",5,"Five")       //All dataTypes Data

    println(Arr[2])
    println(Arr2[4])  //Square brackets indicate 'index'
    println(Arr3[2])
    println(Arr4[2])
    println(Arr5[4])

}