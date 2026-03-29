[33mcommit 86bbca027c3ca49d8d38e38ea6c4faf947652192[m[33m ([m[1;36mHEAD[m[33m -> [m[1;32mmain[m[33m)[m
Author: EmmanuelNyaayo <manuelnyaayo@gmail.com>
Date:   Sun Mar 29 00:19:14 2026 +0300

    Declared top-level variable exitCode

[1mdiff --git a/src/main/kotlin/ExitCodes.kt b/src/main/kotlin/ExitCodes.kt[m
[1mindex 689a61a..2538d8b 100644[m
[1m--- a/src/main/kotlin/ExitCodes.kt[m
[1m+++ b/src/main/kotlin/ExitCodes.kt[m
[36m@@ -3,7 +3,7 @@[m
 // Exit code = 1 (An exception occurred)[m
 // Exit code = 0 (Program finished execution successfully)[m
 [m
[31m-var exitValue = 0[m
[32m+[m[32mvar exitCode = 0[m
 [m
 //ForLoop Function[m
 fun forLoop() {[m
[36m@@ -36,7 +36,7 @@[m [mfun forLoop() {[m
 fun whileLoop(exitValue: Int) {[m
     println()[m
     println("WHILE LOOP....")[m
[31m-    var exitCode = exitValue[m
[32m+[m[32m    exitCode = exitValue[m
 [m
     while (exitCode > 0) {[m
         exitCode--[m
[36m@@ -69,7 +69,7 @@[m [mfun whileLoop(exitValue: Int) {[m
 fun doWhileLoop(exitValue: Int) {[m
     println()[m
     println("DO...WHILE LOOP....")[m
[31m-    var exitCode = exitValue[m
[32m+[m[32m    exitCode = exitValue[m
 [m
     do {[m
         exitCode--[m
