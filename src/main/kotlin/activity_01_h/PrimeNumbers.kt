//Create an application that will accept 2 Integers.
//It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers starting from the lower number up to the largest number.
package activity_01_h
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main(){
    logger.info { "FirstNumber" }
    var firstNumber = readln().toInt()
    logger.info { "SecondNumber" }
    var secondNumber = readln().toInt()


    while (firstNumber < secondNumber) {
        var nonPrime = false

        for (i in 2..firstNumber / 2) {

            if (firstNumber % i == 0) {
                nonPrime = true
                break
            }
        }

        if (!nonPrime && firstNumber != 0 && firstNumber !=1)
            print("$firstNumber ")

        ++firstNumber
    }

    while (secondNumber < firstNumber) {
        var nonPrime = false

        for (i in 2..secondNumber / 2) {

            if (secondNumber % i == 0) {
                nonPrime = true
                break
            }
        }

        if (!nonPrime && secondNumber != 0 && secondNumber !=1)
            print("$secondNumber ")

        ++secondNumber
    }


}