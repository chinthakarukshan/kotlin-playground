fun main(args: Array<String>) {
    val options = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice,gameChoice)
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

fun printResult(userChoice: String,gameChoice:String) {
    var result:String
    if(userChoice == gameChoice) result="Tie!"
    else if((userChoice == "Rock" && gameChoice =="Scissors") ||
        (userChoice=="Scissors" && gameChoice=="Paper") ||
        (userChoice=="Paper" && gameChoice=="Rock")) result="You win!"
    else result="You lose!"

    println("You chose $userChoice. I chose $gameChoice. $result")
}