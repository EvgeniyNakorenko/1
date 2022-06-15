class Tachka{
    var marka:String="toyota"
    var obdvig=2.4
    var godvip=2009
}
fun main(){
    val mashina1: Tachka= Tachka()
    mashina1.marka="kia"
    mashina1.godvip=2019
    mashina1.obdvig=1.6
    println(mashina1.godvip)
    println(mashina1.marka)
    println(mashina1.obdvig)
    val mashina2 : Tachka=Tachka()
    mashina2.marka="ford"
    mashina2.obdvig=2.0
    mashina2.godvip=2015
    println(mashina2.marka)
    println(mashina2.obdvig)
    println(mashina2.godvip)

}