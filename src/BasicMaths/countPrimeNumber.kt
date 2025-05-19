package BasicMaths

import kotlin.math.sqrt


fun main() {
    val input = 6
    val result = countPrimeNumber(input)
    println(result)
}

fun countPrimeNumber(input: Int):Int{
    var count = 0
    for (i in 2..input){
        println("$i some value ${primeNumberNew(i)}")
        if(primeNumberNew(i)){
            count++
        }
    }
    return count
}

fun primeNumberNew(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
