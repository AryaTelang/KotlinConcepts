fun main(){
//Loops
for (i in 1..10){
if(i%2==0)
continue
if(i==9)
break
println(i)
}
for (i in 2 until 5)// upwards
{
println("*")
}

for(i in 10 downTo 5)
{
println("down")
}
for(i in 1 until 20 step 3){
if(i in 10..14)
continue
println(i)
}//i + 3 is printed
var n =1
while(n<3){
   println(n) 
   n++
}
var i=3
do{
    println("Hello")
    i++
}while(i<2)
var x=0
var y=0
// labels , cannot target inner loop from outer
outer@ while(x<10)
{
    while(y<x)
    {
        if(y==5) break@outer
        println(y)
        y++
    }
    x++
}
}