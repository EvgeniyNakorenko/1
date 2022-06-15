fun main() {
    var x=0
    val n= readLine()!!.toInt()
    var stroka:String
    repeat(n){
        stroka= readLine()!!

        if (stroka.contains("+")) x++
        else if (stroka.contains("-")) x--
    }
    print(x)
}