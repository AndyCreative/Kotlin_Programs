package org.example

class HelloWorld(var name1:String) {
    fun word() {
        print("name:$name1")
    }
}

fun main() {
    HelloWorld("prins").word()
}