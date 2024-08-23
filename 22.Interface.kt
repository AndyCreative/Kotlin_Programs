package org.example

interface myinterface
{
    fun Name():String
    val age:Int
    fun hello()
    {
        println("Hello World!!")
    }
}

class Details:myinterface
{
    override fun Name() = "Krish"
    override val age = 21
}

fun main() {
    var obj = Details()
    println("age : ${obj.age}")
    print(obj.hello())
    println(obj.Name())
}