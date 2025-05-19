package BasicMaths

fun main() {
  val input = 6
  val result = fact(input)
  println(result)
}

fun fact(input:Int): Int{
    if(input == 0) return 1;
    return input * fact(input-1)
//    var factValue = 1;
//    for (i in 1..input){
//        factValue *= i;
//    }
//    return factValue
}
