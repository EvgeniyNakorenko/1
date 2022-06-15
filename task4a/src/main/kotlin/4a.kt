fun main() {
    val w:Int?= readLine()?.toIntOrNull()
    val ost= w!! %2
    if(w >3&&ost==0) println("YES")
    else println("NO")
}