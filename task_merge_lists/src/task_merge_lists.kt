
class Sort(val list1: List<Int?>?, val list2: List<Int?>?){
    fun size(): Int {
        if ((list1?.size ?: 0) > (list2?.size ?: 0)) {
            return list1?.size ?: 0
        }
        else {
            return list2?.size ?: 0
        }
    }
    fun addtolist(): MutableList<Int> {

        val list3: MutableList<Int> = mutableListOf()
                for (i in 0 until size()) {
                    if (list1?.get(0) ==null && list2?.get(0) ==null) break

                    if (list1!![i]!! <= list2!![i]!!) {
                        list3.add(list1[i]!!)
                        list3.add(list2[i]!!)
                    } else if (list1[i]!! >= list2[i]!!) {
                        list3.add(list2[i]!!)
                        list3.add(list1[i]!!)
                    }
                }
        return list3
    }
}
fun main(){
    val list1= readLine()?.split(" ")?.toMutableList()?.map { it.toIntOrNull() }
    val list2= readLine()?.split(" ")?.toMutableList()?.map { it.toIntOrNull() }
    println(Sort(list1,list2).addtolist())
}