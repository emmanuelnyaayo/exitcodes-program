// Simple exit codes program; Using for, while and do...while loops
// Exit code = 130 (An infinite loop occurred)
// Exit code = 1 (An exception occurred)
// Exit code = 0 (Program finished execution successfully)

var exitValue = 0

//ForLoop Function
fun forLoop() {
    println("FOR LOOP....")
    for (i in 130 downTo 0) {
        if (i == 130) {
            println("An infinite loop has occurred...")
//            break
        }
        if (i in 2..129) {
            continue
        }

        if (i == 1) {
            println("An exception has occurred..")
//            break
        }

        if (i == 0) {
            println("The program has finished successfully..")
//            break
        }

        println("exit code = $i")

    }
}

//WhileLoop Function
fun whileLoop(exitValue: Int) {
    println()
    println("WHILE LOOP....")
    var exitCode = exitValue

    while (exitCode > 0) {
        exitCode--

        if (exitCode == 130) {
            println("An infinite loop occurred...")
//            break
        }

        if (exitCode in 2..129) {
            continue
        }

        if (exitCode == 1) {
            println("An exception has occurred..")
//            break
        }

        if (exitCode == 0) {
            println("The program has finished successfully..")
//            break
        }

        println("exit code = $exitCode")

    }
}

//DoWhileLoop Function
fun doWhileLoop(exitValue: Int) {
    println()
    println("DO...WHILE LOOP....")
    var exitCode = exitValue

    do {
        exitCode--

        if (exitCode == 130) {
            println("An infinite loop occurred...")
//            break
        }

        if (exitCode in 2..129) {
            continue
        }

        if (exitCode == 1) {
            println("An exception has occurred..")
//            break
        }

        if (exitCode == 0) {
            println("The program has finished successfully..")
//            break
        }

        println("exit code = $exitCode")

    } while (exitCode > 0)
}

fun main() {
    //Function calls
    forLoop()

    whileLoop(exitValue = 131)

    doWhileLoop(exitValue = 131)

}