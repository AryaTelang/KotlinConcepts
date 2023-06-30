fun main()
{
    even()
    println(armstrong(372))
}
fun even()
{
    var sum=0
    for(i in 1..20)
    {
        if(i%2==0){
            println(i)
            sum+=i
        }
    }
    println(sum)
}
fun armstrong(a: Int):Boolean
{
    var b=a
    var c=a
    var sum=0
    while(b!=0)
    {
        rem=b%10
        sum+=rem*rem*rem
        b=b/10
    }
    if(sum==c)return true
    else return false
}