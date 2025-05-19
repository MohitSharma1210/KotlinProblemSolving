package BasicMaths

fun main() {
    val input = 6;
    var arr:Array<Int> = divisors(input)
    println(arr.contentToString())
}



//Using Array

//fun divisors(input:Int):Array<Int>{
//    val array = Array(input) { 0 }
//    for (i in 1..input){
//        println(i)
//        if(input % i == 0) {
//            array[i-1] = i
//        }
//    }
//    return array
//}


// Using List
fun divisors(input:Int): Array<Int> {
    val list = mutableListOf<Int>()
    for (i in 1..input){
        if(input % i == 0) {
           list.add(i)
        }
    }
    return list.toTypedArray()
}
