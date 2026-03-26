// Simple exit codes program; Using for, while and do...while loops
// Exit code = 130 (An infinite loop occurred)
// Exit code = 1 (An exception occurred)
// Exit code = 0 (Program finished execution successfully)

fun main() {

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

    println()
    println("WHILE LOOP....")
    var exitCode = 131

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

    println()
    println("DO...WHILE LOOP....")
    exitCode = 131

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