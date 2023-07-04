fun main()
{
    val user1= User("Aryan","Telan",19)// object is already initialised
    //lazy initialization
    val user2 by lazy {
        User("User1","Lname1",20)
        User("Abc","xyz",23)
    }//not initialized
    println(user2.name)//both objects created
}
class User(var name:String,var Lname: String,var age:Int)
{
    init {
        println("User: $name $Lname was created ")
    }
}