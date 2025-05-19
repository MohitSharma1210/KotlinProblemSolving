package BasicMaths

fun main() {
    var input: Int = 0
    val result = countAllDigit(input)
    println(result)
}

fun countAllDigit(input:Int):Int{
    var number = input
    var value = 0
    if (number == 0) return 1
    while (number>0){
        value++
        number /= 10
    }
    return value
}