import kotlin.reflect.typeOf

fun main()
{
val user=User("Arya","Telang",19)
user.faveShow="Squid Games" // if u do not init later,it will throw error
    println(user.faveShow)
}


class User(name: String,var lastName:String,var age:Int)
{
lateinit var faveShow: String // i want a property but ill define later=lateinit
//lateinit var age:Int -> cannot use on some types
}