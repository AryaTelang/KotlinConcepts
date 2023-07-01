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
    poke.detailsPokemon()
    User("Arya", lastName = "Telang",19)

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
class Pokemon(var name:String,var type:String)
{
    fun detailsPokemon()
    {
        println(name)
        println(type)
    }

}
class User(name: String,var lastName:String,var age:Int)
{
    var name :String
    init {
        if(name.lowercase().startsWith("a"))
        {
            this.name=name
        }
        else
        {
            this.name="User"
            println("Doesnt start with a ")
        }

    }

}