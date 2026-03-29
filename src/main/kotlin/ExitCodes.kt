// Simple exit codes program; Using for, while and do...while loops
// Exit code = 130 (An infinite loop occurred)
// Exit code = 1 (An exception occurred)
// Exit code = 0 (Program finished execution successfully)

fun getExitMessage(code: Int): String? {
    return when (code) {
        130 -> "An infinite loop has occurred.."
        2 -> "A minor warning.."
        1 -> "An exception has occurred.."
        0 -> "The program has finished successfully.."
        else -> null
    }
}

fun collectKnownExitCode(code: Int, results: MutableList<Pair<Int, String>>) {
    val message = getExitMessage(code)
    if (message != null) {
        results.add(code to message)
    }
}

//ForLoop Function
fun forLoop(): List<Pair<Int, String>> {
    val results = mutableListOf<Pair<Int, String>>()

    for (i in 130 downTo 0) {
        collectKnownExitCode(i, results)
    }

    return results
}

//WhileLoop Function
fun whileLoop(exitCode: Int): List<Pair<Int, String>> {
    val results = mutableListOf<Pair<Int, String>>()
    var code = exitCode

    while (code > 0) {
        code--

        collectKnownExitCode(code, results)
    }

    return results
}

//DoWhileLoop Function
fun doWhileLoop(exitCode: Int): List<Pair<Int, String>> {
    val results = mutableListOf<Pair<Int, String>>()
    var code = exitCode

    do {
        code--

        collectKnownExitCode(code, results)

    } while (code > 0)

    return results
}

fun printResults(title: String, results: List<Pair<Int, String>>) {
    println("\n$title")
    for ((code, message) in results) {
        println(message)
        println("exit code = $code")
    }
}

fun main() {
    //Calling Printing Function
    printResults(title = "FOR LOOP ....", results = forLoop())
    printResults(title = "WHILE LOOP ....", results = whileLoop(exitCode = 131))
    printResults(title = "DO..WHILE LOOP ....", results = doWhileLoop(exitCode = 131))

}