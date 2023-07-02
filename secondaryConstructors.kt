import kotlin.reflect.typeOf

fun main()
{
 //OOP , using template(class) we create object
    val car1=Car()//instantiation
    car1.name="Toyota"
    car1.model="A5304"
    car1.color="Black"
    println("Name ${car1.name}")
    println("Color ${car1.color}")
    println("Model ${car1.model}")
    car1.move()
    val car2 =Car()//instantiation
    car2.name="Honda"
    car2.model="Civic"
    car2.color="Green"
    println("Name ${car2.name}")
    println("Color ${car2.color}")
    println("Model ${car2.model}")
    car1.stop()
    car2.move()
    val stud=Student("Arya","Computer Engineering")
    stud.details()

    val poke = Pokemon("Pikachu","Electric")
    val poke2 = Pokemon("Geodude", type="rock", exp = 1000)
    poke.detailsPokemon()
    User("Arya", lastName = "Telang",19)
    val user=User("Arya")
    println(user.name)
    println(user.lastName)
    println(user.age)
// Object specific constructor
    val friend=User("Arya","Telang")
    println(friend.name)
    println(friend.lastName)
    println(friend.age)


}
class Car(){
    var name="" //properties of class
    var model=""
    var color=""
    fun move()
    {
    println("${name} ${model} Moving")
    }
    fun stop()
    {
    println("${name} ${model} Stopped")
    }
}
class Student(name:String, course:String)
{
    var name=name
    var course=course

    fun details()
    {
        println(name)
        println(course)
    }

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

class User(var name: String,var lastName:String,var age:Int)
{
    //secondary constructor need to call primary constructor
    constructor(name: String) : this(name,"LastNAME",0)
    {
        println("2nd constructor")
    }
    constructor(name: String,lastName:String) : this(name,lastName,0)
    {

        println("3nd constructor")
    }// concise way for def values is adding them in class arguments
    // but upon obj creation you want to execute some code then
    // use the above logic
}