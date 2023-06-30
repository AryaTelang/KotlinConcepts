fun main()
{
    val names: Array<String> = arrayOf("Arya","abc","xyz")
    val nums= arrayOf(1,2,3,4,5)

    val random= arrayOf("hello",1,2,true)
    names[1]="Bozo"
    println(names[1])
    println(names.size)
    for(i in random)
    {
        if(i==true) {
            var k = random.indexOf(i)
            println("boolean present $k")
        }
        if( i is String)
            println("String present at ${random.indexOf(i)+1}")
    }
    val row: Array<Int> = arrayOf(2,3,4)
    val col: Array<Int> = arrayOf(4,2,3)
    val matrix = arrayOf(intArrayOf(2,3,4), intArrayOf(4,2))
    transe()
    val arr: Array<Int> = arrayOf(3,5,2,7,3,1,0,12)
    println(maxi(arr))
    println(mini(arr))
}
fun maxi(a: Array<Int>):Int{
    var max=0
    for(i in a)
    {
        if(i>=max)
            max=i
    }
    return max
}

fun mini(a: Array<Int>):Int{
    var min=100000
    for(i in a)
    {
        if(i<=min)
            min=i
    }
    return min
}
fun transe()
{
    val row = 2
    val column = 3
    val matrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 6, 4))


    val transpose = Array(column) { IntArray(row) }
    for (i in 0..row - 1) {
        for (j in 0..column - 1) {
            transpose[j][i] = matrix[i][j]
        }
    }
    for (row in transpose) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}
