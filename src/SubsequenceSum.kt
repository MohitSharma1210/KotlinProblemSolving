fun main() {
    val i = 0;
    val s = 2;
    val arr = arrayOf(1,2,1)
    val ds = mutableListOf<Int>()

    // all subsequence which sum is k
    subSequenceSum(i, arr, ds, 0, s)

}

fun subSequenceSum(i:Int,arr:Array<Int>,ds:MutableList<Int>,sum:Int, s:Int){
    // Base condition that if index equal than array size and sum == target it means it traverse fully and satisfied
    if (i == arr.size){
        if( s == sum){
            println(ds)
        }
        return
    }
    // to prevent other recursion calls
    if(sum > s) {
        return
    }
    // To create subsequence this we are using Take/Not Take technique

    // we are adding value in data structure this is take call and we are passing update sum in next call
    ds.add(arr[i])
    subSequenceSum(i+1, arr, ds,sum+arr[i], s)  // here we are using sum+arr[i]
                                                       // because we are providing updated sum

    // This is not take call where we are removing elements. it is calling at the backtrack time
    ds.remove(arr[i])
    subSequenceSum(i+1,arr, ds ,sum,s)     // here we are using sum-arr[i]
                                              // because in kotlin last added sum value
                                            //  not reflated so not using sum-arr[i] but in JAVA we should use
}