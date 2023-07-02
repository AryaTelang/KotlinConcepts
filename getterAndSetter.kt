import kotlin.reflect.typeOf

fun main()
{

    val poke = Pokemon("Pikachu","Electric")
    val poke2 = Pokemon("Geodude", type="rock", exp = 1000)
    poke.detailsPokemon()
    User("Arya", lastName = "Telang",19)
    val user=User("Arya","T",23)
    println(user.name)
    println(user.lastName)
    println(user.age)
// Object specific constructor
    val friend=User("Arya","Telang",20)
    println(friend.name)// we are using getters and setters but it is encapsulated
    println(friend.lastName)
    println(friend.age)

    user.name=" Cow"// calls the setter , passes to value
    // if passed thru the objec then it would be Miss Cow

}
//directly taking params in the arguments, no need for constructor
class Pokemon(var name:String,var type:String,var exp:Int=0)
{
    fun detailsPokemon()
    {
        println(name)
        println(type)
    }

}

class User(name: String,var lastName:String,var age:Int)
{
    var name=name
    get() {
        return "Miss .$field"
    } set(values){
        println("$values is the new value")
            field=values
        }// auto generated Kotlin Code

}