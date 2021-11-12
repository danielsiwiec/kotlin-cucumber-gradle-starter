fun main(args: Array<String>) {
    println("What's your name?")
    val name = readLine()
    println("Hello $name!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}