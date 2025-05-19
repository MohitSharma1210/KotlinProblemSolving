package BasicMaths

fun main() {
    val input = 999
    val result = largestDigit(input)
    println(result)
}

fun largestDigit(input:Int):Int{
    var number = input
    if( number == 0) return 0
    var largestDigit  = 0
    var digit = 0
    while (number > 0){
        digit = number % 10
        if(largestDigit < digit) largestDigit = digit
        number /= 10
    }
    return largestDigit
}