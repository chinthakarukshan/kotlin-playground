fun main(args: Array<String>) {
    val options = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>):String {
    var isValidInput = false
    var usersChoice = ""

    while(!isValidInput) {
        print("Please enter one of the following: ")
        for(item in optionsParam) print(" $item")
        println(".")

        val userInput = readLine()

        if(!userInput.isNullOrEmpty() && optionsParam.contains(userInput)) {
            isValidInput = true
            usersChoice = userInput
        } else {
            println("You must enter a valid choice")
        }
    }

    return usersChoice
}