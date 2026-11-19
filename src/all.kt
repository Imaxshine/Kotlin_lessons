fun main(){
    val orodha = listOf(71, 22, -33, 55, -60, 40, -20, 20)
    val zoteNiPostive = orodha.all { it >= 0 }
//    println(zoteNiPostive)
    if (zoteNiPostive){
        println("namba zote ni postive")
    }else{
        println("Namba zote sio Postive")
    }
}