//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
//Note: Error checking must be done.
package activity_01_d
import java.util.Scanner
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main(){

    logger.info { "Enter 5 amounts" }

    val reader = Scanner(System.`in`)
    logger.info { "Enter first amount" }
    var firstNumber:Float = reader.nextFloat()

    logger.info { "Enter second amount" }
    var secondNumber:Float = reader.nextFloat()

    logger.info { "Enter third amount" }
    var thirdNumber:Float = reader.nextFloat()

    logger.info { "Enter fourth amount" }
    var fourthNumber:Float = reader.nextFloat()

    logger.info { "Enter fifth amount" }
    var fifthNumber:Float = reader.nextFloat()

    logger.info { "Divide the value by how many" }
    var divider:Int = reader.nextInt()



    var sumAmount = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber
    var total = sumAmount / divider

    logger.info { "Total: $total" }




}






