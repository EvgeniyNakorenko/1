fun main(){
    val sum1= readln().split("+").map { it.toInt() }.toMutableList()
    val ss=sum1.sort()
    val rez= sum1.map { "$it+" }.toMutableList()
    for (i in 1 until rez.size) {
        rez[0]+=rez[i]
    }
    val otv=rez[0]
    println(otv.dropLast(1))
}