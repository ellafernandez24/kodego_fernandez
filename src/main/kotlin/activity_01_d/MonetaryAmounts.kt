//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
//Note: Error checking must be done.
package activity_01_d
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main() {

    var sum = 0.0
    for (counter in 1..5) {
        logger.info { "Enter number[$counter]:" }
        var number = readln().toDoubleOrNull()
        if (number == null) {
            do {
                logger.error { "Please enter valid input: " }
                number = readln().toDoubleOrNull()
            } while (number == null)
        }
        sum += number
    }

    logger.info { "Divide by how many" }
    var numDivide = readln().toIntOrNull()
    if (numDivide == null) {
        do {
            logger.error { "Please enter valid input: " }
            numDivide = readln().toIntOrNull()
        } while (numDivide == null)
    }

    var totalAmount = sum / numDivide
    var roundOff = String.format("%.2f", totalAmount)

    logger.info {"Total: $roundOff" }

}











