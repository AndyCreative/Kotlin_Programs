package org.example
//Syntax of simple class
class Message (){
}

//Passing Parameter
class Demo(var Number:Int)
{

}
// Declaring Method
class PrintMethod(var Name:String,var No:Int)
{
    fun Message()
    {
        println("Name : $Name  &  No : $No")
    }
}


fun main() {
    var m = Message();
    var d = Demo(10);
    println(d.Number)            //Accessing Variable

    var pm = PrintMethod("kotlin",10);
    pm.Message();                  //Accessing Method

    pm.Name="Android"                   //Changing Value
    println(pm.Name)

}