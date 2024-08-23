import javax.xml.ws.soap.Addressing

abstract open class First
{
    fun add(){
        var no1:Int=10
        var no2:Int=20
        var Sum:Int=no1+no2
        println("$Sum")
    }
    abstract  fun sum1()
}

class Second:First()
{
  override  fun sum1()
  { var no1:Int=20
      var no2:Int=10
      var Min:Int=no1-no2
        println("$Min")
    }
}
fun main() {
    var f:First=Second()
    f.sum1()
    f.add()


}