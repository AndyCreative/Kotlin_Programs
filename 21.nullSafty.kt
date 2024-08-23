import org.jetbrains.annotations.NotNull


fun main() {
    var nevernull:String="Not Null"
    var nullable:String?=" Null"
    nullable=null
    var inferredNonNull="Not Null"

    println(strLength(nevernull))
    println(strLength(nullable))
}

fun strLength(notNUll:String?):Int?
{
    return  notNUll?.length
}