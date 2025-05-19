package BasicMaths

fun main() {
    val input = 4
    val result = perfectNumber(input)
    println(result)
}

fun perfectNumber(input:Int) : Boolean{
    var result = 0
    for (i in 1..input - 1){
        if(input % i == 0) {
            result += i
        }
    }
    return result == input
}