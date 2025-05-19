package BasicArray

fun main() {
    val n = 5
    val array = arrayOf(1,2,1,1,5,1)
    val result = countOddNumbers(array)
    println(result)
}

fun countOddNumbers(array: Array<Int>):Int{
    var count = 0
    for (element in array){
        if(element % 2 != 0) count++
    }
    return count
}