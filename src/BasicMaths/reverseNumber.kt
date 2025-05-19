package BasicMaths

fun main() {
    val input = 234
    val result = reverseNumber(input)
    println(result)
}

fun reverseNumber(input:Int):Int{
    var number = input
    if(number == 0) return 0
    var revNum = 0
    var lastDigit = 0
    while (number > 0){
        lastDigit = number % 10
        revNum = (revNum * 10) + lastDigit
        number /= 10
    }
    return revNum
}