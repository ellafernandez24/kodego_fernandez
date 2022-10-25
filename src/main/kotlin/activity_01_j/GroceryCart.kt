//Using Activity 01 - C
//Implement a process where items are added to the grocery cart.
//User : Cashier
//Goal : List of Items bought, how many items were bought and total cost.
package activity_01_j
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main(){
    var listOfItems: ArrayList<String> = ArrayList()
    var costOfItems: ArrayList<Double> = ArrayList()

    do {
        logger.info { "Item:" }
        var listItems = readLine().toString()
        listOfItems.add(listItems)
        logger.info {"Cost:"}
        var costItems = readLine()?.toDouble()
        if (costItems != null)
        {
            costOfItems.add(costItems)
        }
        logger.info {"Add another item?[Y/N]"}
        var yesOrNo = readLine().toString()
        if(yesOrNo.lowercase() == "n")
        {
            break
        }
    }while(yesOrNo.lowercase() == "y")

    var itemCostSum = costOfItems.sum()
    var roundOffCostSum = String.format("%.2f", itemCostSum)
    var itemSize = listOfItems.size

    logger.info { "List of all the items: $listOfItems" }
    logger.info { "Quantity of items: $itemSize" }
    logger.info { "Total Cost: P$roundOffCostSum" }


}

