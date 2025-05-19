package BasicMaths

import kotlin.math.pow

fun main() {
    val input = 0
    val result = isArmstrong(input)
    println(result)
}


fun isArmstrong(input:Int): Boolean{
    var number = input
    val list = mutableListOf<Int>()
    var count = 0
    var digit: Int
    var result =0
    while (number > 0){
        count++
        digit = number % 10
        list.add(digit)
        number /= 10
    }
    for (i in list){
        result += i.toDouble().pow(count).toInt()
    }
    return result == input
}