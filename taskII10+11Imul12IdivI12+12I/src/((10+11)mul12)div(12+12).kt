fun main(){
    var mas= readLine()!!.toString()
    val parexp = doubPar(mas)
    val sum1 = parexp.split("+").sumOf { it.toInt() }
    mas = mas.replace("($parexp)", "$sum1")
    val (mult,expMult)=mult(mas)
    mas = mas.replace("($expMult)", "$mult")
    val parexp2=doubPar(mas)
    val sum2= parexp2.split("+").sumOf { it.toInt() }
    mas = mas.replace("($parexp2)", "$sum2")
    println(division(mas))
}
fun doubPar(s: String): String {
    val x = s.find { it == '(' }
    val xInd=s.indexOf(x!!)
    val sReplace= s.removeRange(xInd..xInd)
    val z=sReplace.find { it == '(' }
    val y = s.find { it == ')' }
    var exp=""
    exp += if (z!=null){
        if (sReplace.indexOf(z)<sReplace.indexOf(y!!)){
            s.slice(s.indexOf(z)+2 until s.indexOf(y))
        }
        else s.slice(s.indexOf(x)+1 until s.indexOf(y))
    }
    else s.slice(s.indexOf(x)+1 until s.indexOf(y!!))
    return exp
}
fun division(s:String): Double {
    val x = s.find { it == '/' }.toString()
    var a= s[s.indexOf(x)-1].toString()
    a = s[s.indexOf(x) - 2]+a
    if (s.indexOf(x)==3) a=s[s.indexOf(x) - 3] +a
    var b=s[s.indexOf(x)+1].toString()
    b += s[s.indexOf(x) + 2]
    return a.toDouble()/b.toDouble()
}
fun mult(s:String): Pair<Int, String> {
    val x = s.find { it == '*' }.toString()
    var a= s[s.indexOf(x)-1].toString()
    a = s[s.indexOf(x) - 2]+a
    var b=s[s.indexOf(x)+1].toString()
    b += s[s.indexOf(x) + 2]
    val exp= "$a*$b"
    return a.toInt()*b.toInt() to exp
}