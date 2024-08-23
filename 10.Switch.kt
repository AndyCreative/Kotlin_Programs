package org.example

fun main() {
    print("Enter Any Number between 1 to 5: ")
    var no:Int = readLine()!!.toInt()

    //SWITCH STATEMENT
    when(no)
    {
        1 -> print("One")
        2 -> print("Two")
        3 -> print("Three")
        4 -> print("Four")
        5 -> print("Five")

    }
    println()
    //---------------------------------------------------------------------------------------------

    //SWITCH STATEMENT for Multiple Value
    print("Enter Any Number between 1 to 5: ")
    var num:Int = readLine()!!.toInt()
    when(num)
    {
        1 -> print("One")
        2 -> print("Two")
        3 -> print("Three")
        4,5 -> print("More Than Three")
        //Rang function using 'in' keyword
        in 6..10-> print("You Enter more than 5")

        else -> print("Default value")
    }

}