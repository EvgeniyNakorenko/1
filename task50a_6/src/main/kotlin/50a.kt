fun main(){
    val vvod= readLine()!!.split(" ").map { it.toInt()  }
    val n= vvod[0]
    val m= vvod[1]
    var koll=0
    val ostn=n%2
    val ostm=m%2
        if (n==1 && m==1){
            koll = 0
            }
        else {
            if (ostn in 0 until 1 ||ostm in 0 until 1){
                koll=m*n/2
            }
            else if (ostn !in 0 until 1){
                koll=m*(n-1)/2 +m/2
            }
            else if(ostm !in 0 until 1){
                koll=n*(m-1)/2 +n/2
            }
        }
    println(koll)
}