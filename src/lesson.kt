fun main(){
    val usajili = listOf(
        Triple("Abigael", "TS-00023", 45),
        Triple("Esau", "TS-00070", 85),
        Triple("Husein", "TS-00008", 58),
        Triple("Amedeus", "TS-00011", 61),
        Triple("Ashura", "TS-00033", 49),
        Triple("Emmanuel", "TS-00113", 72),
        Triple("Rashid", "TS-00217", 54)
    )
    //Tafuta kwa Reg-No: zao

    while (true){
        println()
        print("press (Y) to view all details or pass the real TS Reg-No / 'X' to Exist > ")
        val userInput = readln().trim()
        if (userInput.lowercase() == "x"){
            println("Thanks for using our app 🙏")
            break
        }
        if (userInput.lowercase() == "y"){
            usajili
                .forEach { println("${it.first.take(1)}... REg: ${it.second} Av: ${it.third} \n")}
            continue
        }
        //Zuia kama length ni ndefu zaidi ya 10
        if (userInput.length > 10){
            println("Reg-No is too long")
            continue
        }

        val id = usajili.find { it.second == userInput.uppercase()}
        if (id != null){
            println("${id.first.uppercase()} Reg: ${id.second} Average: ${id.third}")
        }else{
            println("We didn't find a student with Reg-No: ${userInput.uppercase()}")
            continue
        }
    }
}
