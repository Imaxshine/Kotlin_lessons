fun wanafunzi(){
    val majina = listOf<String>("John", "Ester", "Gift", "Anna", "Baraka")
    val jibu = majina.any{
        println("Namtafuta $it")
        it == "Gift"}
    println(jibu)
}
fun main(){
    wanafunzi()
}