package BasicMaths

fun main() {
    val input = 23455776
    val result = countOddDigit(input)
    println(result)
}

fun countOddDigit(input:Int):Int{
    var number = input
    var count = 0
    if(number ==0) return 0
    while (number>0){
        val digit = number % 10
        if(digit % 2 == 1)
            count++
        number /= 10
    }
    return count
}
