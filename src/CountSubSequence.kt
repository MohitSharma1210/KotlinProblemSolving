fun main() {
    val arr = arrayOf(1,2,1)
    val list = mutableListOf<Int>()
    val n = arr.size
    val target = 2
    val result =countSubsequence(0,arr,list,n,target,0)
    println(result)
}

fun countSubsequence(i:Int,arr:Array<Int>,list: MutableList<Int>,n:Int,target:Int,sum:Int):Int{
    if (i==n){
        if (target == sum){
            println(list)
            return 1
        }
        return 0
    }

    list.add(arr[i])
    val l = countSubsequence(i+1,arr,list,n,target,sum+arr[i])
    list.remove(arr[i])
    val r = countSubsequence(i+1,arr,list,n,target,sum)
    return l+r
}