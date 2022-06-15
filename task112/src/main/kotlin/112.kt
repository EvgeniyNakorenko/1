fun main() {
    val fst = readln().lowercase()
    val sec = readln().lowercase()
    val razm = fst.length
    var otv=0
    for (i in 0 until razm) {
    if (fst[i]!=sec[i]) {
        if (fst[i]>sec[i]){
            otv=1
            break
        }
        else if (fst[i]<sec[i]){
            otv=-1
            break
        }
    }
}
    println(otv)
}