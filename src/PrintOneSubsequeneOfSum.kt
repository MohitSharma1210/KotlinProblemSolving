fun main() {
    val arr = arrayOf(1,2,1)
    val list = mutableListOf<Int>()
    val n= arr.size
    val target = 2
    oneSubsequence(0,arr,list,n,target,0)
}

fun oneSubsequence(i:Int,arr:Array<Int>,list: MutableList<Int>,n:Int,target:Int,sum:Int):Boolean{
    if (i == n){
        if(target == sum){
            println(list)
            println(list)
            return true
        }
        return false
    }
    list.add(arr[i])
    if(oneSubsequence(i+1,arr,list,n,target,sum+arr[i])) return true
    list.remove(arr[i])
    if (oneSubsequence(i+1,arr, list, n, target, sum)) return true
    return false
}

