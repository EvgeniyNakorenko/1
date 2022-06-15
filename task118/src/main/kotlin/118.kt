fun main() {
    val str = readLine()!!.lowercase()
    val rem = str.filterNot { it == 'a' || it == 'e' || it == 'u' || it == 'i' || it == 'o' || it == 'y' }
     val rez= rem.map { ".$it" }.toMutableList()
    for (i in 1 until rez.size) {
        rez[0]+=rez[i]
    }
    println(rez[0])
}