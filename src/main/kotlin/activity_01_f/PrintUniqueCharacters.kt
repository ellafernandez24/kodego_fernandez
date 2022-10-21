//Create an application that will accept 2 string inputs.
//Your application will print all unique characters in both Strings.

package activity_01_f
import mu.KotlinLogging
import java.lang.String
import kotlin.toString

private val logger = KotlinLogging.logger{}

fun main() {

    logger.info { "Enter First String" }
    var userInputFirst = readLine().toString()
    logger.info { "Enter Second String" }
    var userInputSecond = readLine().toString()

    var userInput = userInputFirst+userInputSecond

    for (index in userInput.indices) {
        for (counter in index + 1 until userInput.length) {
            if (userInput.get(index) === userInput.get(counter)) {
                userInput = userInput.replace(String.valueOf(userInput[counter]), " ")
            }
        }
    }
    logger.info { "Unique Characters: $userInput " }
}




