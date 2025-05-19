package BasicArray

fun main() {
    val n = 5
    val array = arrayOf(1,2,3,4,5)
    val result = sumOfArray(array,n)
    println(result)
}

fun sumOfArray(array: Array<Int>,n:Int):Int{
    var sum = 0
    for (element in array){
        sum += element
    }
    return sum
}