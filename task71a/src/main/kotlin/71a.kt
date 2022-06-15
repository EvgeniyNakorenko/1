fun main() {
    val n: Int? = readLine()?.toIntOrNull()
    var i=1
        while (i in 1..n!!){
            val slovo: String? = readLine()
                val perbuk= slovo!!.first()
                val posbuk= slovo.last()
                val kollbuk:Int= slovo.length-2
                if (slovo.length> 10) println("$perbuk$kollbuk$posbuk")
                else println("$slovo")
            i++
        }}