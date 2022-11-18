package activity_03_c
import mu.KotlinLogging
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

private val logger = KotlinLogging.logger{}

var cart: HashMap<String, Int> = HashMap<String, Int>()

fun main(){

//Create an ArrayList of grocery products with 20 entries.
    var groceryList : ArrayList<String> = arrayListOf("Apple","Banana","Oranges", "Potatoes", "Chicken", "Beef",
    "Fish", "Sardines", "Eggs", "Milk", "Paprika", "Ice cream", "Chicken nuggets", "Carrots", "Broccoli", "Lettuce",
    "Cauliflower", "Soap", "Shampoo", "Deodorant")

    addToCart()
    checkOut()
    removeFromCart()


}

//Create a function "addToCart" that will accept a String and an Int. It will add the input in the Hashmap.
//If the Entry already exists, create a new entry in the HashMap.
fun addToCart() {

    do {
        logger.info { "Input item:" }
        var item = readLine().toString()

        if (cart.containsKey(item)) {
            do {
                logger.info { "Item already exist. Pls input item:" }
                item = readLine().toString()
            } while (cart.containsKey(item))
        }

        logger.info { "Input quantity:" }
        var quantity = readln().toInt()

        cart[item] = quantity

        logger.info { "Are you going to add another item? [Y/N]" }
        var choice = readLine().toString()
    } while (choice.lowercase() == "y")
}

//Create a function "checkOut". This will compute how many items have been checked out.
fun checkOut(){

    var total = 0
    for (value in cart.values){
        total += value

    }
    logger.info { "CART:" }
    for(entry in cart.entries){
        logger.info { "Item: ${entry.key} -> Quantity: ${entry.value}" }
    }
    logger.info { "Total items: $total" }
}

//Create a function "removefromCart"  that will accept a String and remove the input from the Hashmap. If there are
// multiple entries, remove all from the HashMap.
fun removeFromCart(){

    var copy = hashMapOf<String, Int>()
    copy.putAll(cart)
    var cartMap = cart as HashMap<String, Int>

    logger.info { "Input item to be removed:" }
    var itemRemove = readLine().toString()
    for (key in copy.keys) {
        if (key.contains(itemRemove, ignoreCase = true)){
            cartMap.remove(key)
        }
    }

    var total = 0
    for (value in cart.values){
        total += value

    }

    logger.info { "CART:" }
    for(entry in cart.entries){
        logger.info { "Item: ${entry.key} -> Quantity: ${entry.value}" }
    }
    logger.info { "Total items: $total" }

}
