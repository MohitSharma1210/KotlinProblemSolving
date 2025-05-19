package BasicArray

fun main() {
    val array = arrayOf(1,2,2,4,5)
    val result = sortedArray(array)
    println(result)
}

fun sortedArray(array: Array<Int>):Boolean {
    var previousElement = array[0]
    for (element in array){
        if(element >= previousElement) {
            previousElement = element
        }else{
            return false
        }
    }
    return true
}
