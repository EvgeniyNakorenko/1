fun main(){
    var mas= readLine()!!.toString()
    repeat(2) {
        val parexp = par(mas)
        val sum = parexp.split("+").sumOf { it.toInt() }
        mas = mas.replace("($parexp)", "$sum")
    }
    println(division(mas))
}
fun par(s: String): String {
    val x = s.find { it == '(' }.toString()
    val y = s.find { it == ')' }.toString()
    val exp= s.slice(s.indexOf(x)+1 until s.indexOf(y))
    return exp
}
fun division(s:String): Double {
    val x = s.find { it == '/' }.toString()
    var a= s[s.indexOf(x)-1].toString()
    a = s[s.indexOf(x) - 2]+a
    var b=s[s.indexOf(x)+1].toString()
    b += s[s.indexOf(x) + 2]
    return a.toDouble()/b.toDouble()
}