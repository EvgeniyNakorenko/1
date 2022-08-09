fun main(){
    var mas= readLine()!!.toString()
    var eq=0
    val (divis,expDivis) =division(mas)
    mas= mas.replace(Regex(expDivis),"")
    eq+=divis
    val summ = sum(mas)
    eq += summ
    println(eq)
}
fun division(s:String): Pair< Int, String> {
    val x = s.find { it == '/' }.toString()
    var a= s[s.indexOf(x)-1].toString()
    a = s[s.indexOf(x) - 2]+a
    var b=s[s.indexOf(x)+1].toString()
    b += s[s.indexOf(x) + 2]
    var div  =0
    var exprDiv=""
    if (s[s.indexOf(x)-3] == '-' ){
        div -= a.toInt()/b.toInt()
        exprDiv = "-$a/$b"
    }
    else {
        div=a.toInt()/b.toInt()
        exprDiv = "$a/$b"
    }
    return div to exprDiv
}
fun sum(s: String): Int {
    val x = s.find { it == '+' }.toString()
    var a = s[s.indexOf(x) - 1].toString()
    a = s[s.indexOf(x) - 2] + a
    var b = s[s.indexOf(x) + 1].toString()
    b += s[s.indexOf(x) + 2]
    return a.toInt() + b.toInt()
}