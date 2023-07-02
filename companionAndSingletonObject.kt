fun main()
{
//Companion Object
    val calci=Calci()
    //val res=calci.sum(5,7)// the sum function doesnt belong to the object anymore
    //it belongs to the class
    var res=Calci.sum(5,6)// using function direct without obj creation
    println(res)
    println(Int.MAX_VALUE)// uses companion object
    println(Calci.max)


    //if we want only one instance in the code without duplication=Singleton
    val ins=Database.getInstance()
    val ins2=Database.getInstance()
    //cannot create direct instance due to private
    println(ins)
    println(ins2)

    //direct singleton
    println(DataB)
    println(DataB)

}
class Calci()
{
    companion object {
        var max=110002
        fun sum(a: Int, b: Int) = a + b
    }
}
class Database private constructor()
{
    companion object{
        private var instances:Database?=null
        fun  getInstance():Database? {
            if(instances==null){
                instances=Database()
            }
            return instances
        }
    }
}
object DataB
{
    init {
        println("databse created")
    }
}