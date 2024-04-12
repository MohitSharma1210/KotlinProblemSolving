fun main(){
    val arr = arrayOf(3,1,2)
    val n = arr.size
    val list = mutableListOf<Int>()
    //Print all the SubSequence with recursion
    subSequence(0,arr, list, n)
}

fun subSequence(i:Int,arr:Array<Int>,list: MutableList<Int>, n:Int){

    // Base condition that if index greater and equal than array size it means it traverse fully
    if (i >= n){
        println(list)
        return
    }
    // To create subsequence this we are using Take/Not Take technique

    // we are adding value in data structure this is take call
    list.add(arr[i])
    subSequence(i+1,arr,list,n)

    // This is not take call where we are removing elements. it is calling at the backtrack time
    list.remove(arr[i])
    subSequence(i+1,arr,list,n)
}