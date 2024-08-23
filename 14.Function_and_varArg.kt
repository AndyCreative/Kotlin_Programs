package org.example


//No Argument No Return Type
fun printmsg()
{
    println("Hello")
}

//fun main() {
//
//}

//With Argument No return Type

fun printMsg(msg : String)
{
    print("Hello $msg")
}

//With Prefix:(default value)
fun printMsgWithPrefix(msg : String, prefixVar: String = "Default Value")
{
    println("prefix = $prefixVar || Name = $msg")
}

fun printMsgWithPrefix2(RollNo :Int ,msg : String, prefixVar: String = "Default Value")
{
    println("RollNo = $RollNo || msg = $msg || prefix = $prefixVar")
}

//With Argument With Return Type
fun sum(a:Int,b:Int):Int
{
    return(a+b)
}

//With Variable Length Of Argument

fun printAll(vararg msg :String)
{
    for(m in msg) print("$m ")
}

fun main()
{
    printMsg("Dear Student")
    println()
    //----------------------------------------------------

    printMsgWithPrefix("Krish")
    println()
    printMsgWithPrefix("Krish", "Men")
    println()
    printMsgWithPrefix(prefixVar = "Women", msg = "Veera")
    println()
    printMsgWithPrefix2(10,"Krish","Student")
    println()
    printMsgWithPrefix2(10, prefixVar = "student",msg="krish")
    println()
    //------------------------------------------------------------

    println("Sum of Two Number is: "+sum(10,20))
    //------------------------------------------------------------

    printAll("abc","bcd","cde","efg")



}