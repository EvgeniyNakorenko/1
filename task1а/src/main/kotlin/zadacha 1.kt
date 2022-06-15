fun main() {
    val fl = readln().split(" ").map { it.toLong() }
    val koll:Long
    val ostx:Long=fl[0]%fl[2]
    val osty:Long=fl[1]%fl[2]
    koll = if (ostx in 0 until 1&&osty in 0 until 1)
        fl[0]*fl[1]/(fl[2]*fl[2])
    else if (ostx !in 0 until 1&&osty in 0 until 1)
        (fl[0]/fl[2]+1)*fl[1]/fl[2]
    else if (ostx in 0 until 1&&osty !in 0 until 1)
        (fl[1]/fl[2]+1)*fl[0]/fl[2]
    else (fl[1]/fl[2]+1)*(fl[0]/fl[2]+1)
    println(koll)
}