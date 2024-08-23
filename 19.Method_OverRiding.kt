

open class Shiva
{
    open fun prayer()
    {
        println("Shiva's prayer")
    }
}

open class Rama:Shiva()
{
    override fun prayer()
    {
        println("Rama's prayer")
    }
}
open class Krishna:Shiva()
{
    override fun prayer()
    {
        println("Krishna's prayer")
    }
}

fun main()
{
    var s:Shiva=Shiva()
    s.prayer()
    s=Rama()
    s.prayer()
    s=Krishna()
    s.prayer()

}