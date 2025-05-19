package BasicMaths

import kotlin.math.sqrt

fun main() {
    val input = 6
    val result = primeNumber(input)
    println(result)
}

fun primeNumber(input:Int):Boolean{
    if(input<2) return false
    var count = 0
    for (i in 2 until sqrt(input.toDouble()).toInt()){
        if(input % i == 0){
            count++
            if(input / i != i){
                count++
            }
        }
    }
    return count == 2
}