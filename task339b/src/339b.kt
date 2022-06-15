fun main(){
    val nm = readLine()!!.split(" ").map { it.toLong() }
    val ai = readLine()!!.split(" ").map { it.toLong() }
    var ans:Long=-1

    for (i in 0 until nm[1]){
        if (i in 0 until 1) ans += ai[0]
        else if (ai[i.toInt()]<ai[(i-1).toInt()]) ans += nm[0] -ai[(i-1).toInt()] +ai[i.toInt()]
        else ans += ai[i.toInt()]-ai[(i-1).toInt()]
    }
    print(ans)
}