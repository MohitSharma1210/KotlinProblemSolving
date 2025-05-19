package BasicArray

fun main() {
   var array = arrayOf(1,2,3,4,5)
   var result = reverseArray(array)
    println(result.contentToString())
}

fun reverseArray(array: Array<Int>):Array<Int>{
   var temp = 0
    var start  = 0;
    var end = array.size-1
    while (start < end){
        temp = array[start]
        array[start] = array[end]
        array[end] = temp
        start++
        end--
    }
    return array
}