
fun main() {
 println(compute(9))
 println(compute(2,5))
 println(compute(2.5,3.5))
 message("Arya","Hello","Pratham")
 message(user="Scammer",rec="Everyone")//Named params
 println(add(9,3,2,6,4))
 println(add(2,3))
 names("A","B","C")
}
//Function Overloading
fun compute(a: Int):Int{
    return a*a
    
}

fun compute(a: Double, b: Double):Double{
    return a*b
}

fun compute(a: Int, b: Int):Int{
    return a*b
}
//Default Values to function params
fun message(user: String="No one", message: String=msg(), rec:String =defReciever())
{
    println("$user has to say $message to $rec")
}
fun defReciever():String
{
    return "Someone"
}
fun msg()="Stfu"
//vararg keyword
fun add(vararg num:Int):Int{
    var res:Int=0
    for (i in num)
    {
    res+=i
    }
    return res
}
//it operator
fun names(vararg name:String){
    name.forEach{println(it)}
}