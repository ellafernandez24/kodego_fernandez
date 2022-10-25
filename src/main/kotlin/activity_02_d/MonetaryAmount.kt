//Implement Activity 01 - D using data structure
package activity_02_d
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main(){

    var monetaryAmount : ArrayList<Double> = ArrayList()

    for (counter in 1 .. 5){
        logger.info { "Enter number[$counter]:" }
        var number = readln().toDoubleOrNull()
        if (number == null) {
            do {
                logger.error { "Please enter valid input: " }
                number = readln().toDoubleOrNull()
            } while (number == null)
        }
        monetaryAmount.add(number)
    }

    logger.info { "Divide by how many" }
    var numDivide = readln().toIntOrNull()
    if (numDivide == null) {
        do {
            logger.error { "Please enter valid input: " }
            numDivide = readln().toIntOrNull()
        } while (numDivide == null)
    }
    var sumOfNumbers = monetaryAmount.sum()
    var totalAmount = sumOfNumbers / numDivide
    var roundOff = String.format("%.2f", totalAmount)

    logger.info {"List of monetary amounts: $monetaryAmount" }
    logger.info { "Number used to divide: $numDivide" }
    logger.info {"Total: $roundOff" }
}

