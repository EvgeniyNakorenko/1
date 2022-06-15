fun main(){
    val nk = readln().split(" ").map { it.toInt() }
    val n= nk[0]
    val k= nk[1]
    val balli : MutableList<Int>
    balli= readln().split(" ").map { it.toInt() } as MutableList<Int>
    var koll=0
    for(el in balli){
        if (el >= balli[k-1] && el !=0) koll++
    }
    println(koll)
    }