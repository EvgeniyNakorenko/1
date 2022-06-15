import kotlin.math.abs
fun main() {
    var kollx = 0
    var kolly = 0
    for (n in 1..5) {
        var vvod = readLine()!!.split(" ").map { it.toInt() }
        if (vvod.contains(1)) {
            kolly +=abs(3-n)
            kollx= abs(2-vvod.indexOf(1))
        }
    }
    print(kolly+kollx)
}