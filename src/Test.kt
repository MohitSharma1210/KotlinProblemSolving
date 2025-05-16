fun reverse(l:Int,r:Int,array: Array<Int>){
    if(l >= r){
      return;
    }
    swap(l,r,array)
    reverse(l+1,r-1,array)
}

fun reverse1(i:Int,n:Int,array: Array<Int>){
    if(i >= n/2){
        return
    }
    swap(i,n-i-1,array)
    reverse1(i+1,n,array)
}

fun swap(l:Int,r:Int,array: Array<Int>){
    val temp = array[l]
    array[l] = array[r]
    array[r] = temp
}


fun main(){
var array = arrayOf(1,2,3,4,5)
    reverse1(0,array.size,array)

    println(array.contentToString())

    println(array)

}






