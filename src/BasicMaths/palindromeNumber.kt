package BasicMaths

fun main() {
    val input = 125
    val result = palindromeCheck(input)
    println(result)
}

fun palindromeCheck(input:Int):Boolean{
    var number = input
    if (number == 0) return true
    var revNum = 0
    var lastDigit = 0
    while (number > 0){
        lastDigit = number % 10
        revNum = (revNum * 10) + lastDigit
        number /= 10
    }
     return revNum == input
}