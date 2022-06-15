fun main() {
    val n: Int? = readln().toIntOrNull()
    var rez = 0
    var i = 0
    while (i in 0 until n!!) {
        val a = readln().split(" ").map { it.toInt() }
        if (a.sum() in 2..3) rez++
        i++
    }
    println(rez)
}
