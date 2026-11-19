fun main(){
    print("Jina 1 > ")
    val jina1 = readln().trim()
    print("Jina 2 > ")
    val jina2 = readln().trim()

   val userNames = joiner(firstName = jina1, secondName = jina2, join = { name1, name2-> "${name1.uppercase()} - ${name2.uppercase()}"})
    println(userNames)
}
fun joiner(firstName: String, secondName: String, join:(String, String)-> String): String{
    return join(firstName, secondName)
}
//fun userNames(name1: String, name2: String): String{
//    return "$name1 - $name2"
//}