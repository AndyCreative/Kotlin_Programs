package org.example


fun main() {
    for(i in 1..10) {
        print("$i ")
    }
    println()
    for(i in 1 .. 10 step 2)          //Odd Numbers using 'Step'
    {
        print("$i ")
    }
    println()
    for(i in 2 .. 10 step 2)         //Even Numbers using 'Step'
    {
        print("$i ")
    }
    println()
    for(i in 10 downTo 1 )          //DownTo used for REVERSE Number
    {
        print("$i ")
    }
    println()
    for(i in 10 downTo 1 step 2)    //DownTo with 'Step'
    {
        print("$i ")
    }
}