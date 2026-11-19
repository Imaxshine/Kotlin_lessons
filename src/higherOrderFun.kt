fun masterFun(a: Double, b: Double, kazi:(Double, Double)-> Double): Double{
    return kazi(a,b)
}
fun addNum(a: Double, b: Double): Double{
    val jumla = a + b
    return jumla
}
fun main(){
    val jumla = masterFun(20.0, 30.0, ::addNum)
    println(jumla)
}