//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.
package activity_01_g
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main() {


    var userInputReverse = ""
    logger.info { "Enter string or number:" }
    var userInput = readLine().toString().filter { it.isLetterOrDigit() }.replace(" ", "")


    for(index in (userInput.length - 1) downTo 0){
        userInputReverse += userInput[index]
    }


    if(userInput.lowercase() == userInputReverse.lowercase())
    {
        logger.info { "${userInput.uppercase()} - PALINDROME" }
    }else{
        logger.info { "${userInput.uppercase()} - NOT PALINDROME" }
    }


}
