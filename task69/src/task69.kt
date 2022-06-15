fun main(){
    val n = readLine()!!.toInt()
    var vx =0
    var vy =0
    var vz =0
    repeat(n) {
        val vectorsXYZ = readLine()!!.split(" ").map{it.toInt()}
        vx += vectorsXYZ[0]
        vy += vectorsXYZ[1]
        vz += vectorsXYZ[2]
    }
    if (vx==0&&vy==0&&vz==0) println("YES") else println("NO")
}