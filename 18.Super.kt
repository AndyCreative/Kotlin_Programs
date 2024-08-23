open class A()
{
    constructor(no:Int):this(){
        println("A's constructor : $no")
    }
    init
    {
        println("A's initializer Block")
    }
}

class B: A
{
    constructor(no:Int,name:String):super(50){
        println("B's constructor : $no and $name")
    }
    init
    {
        println("B's initializer Block")
    }
}

fun main()
{
    var b=B(20,"Android")
}

