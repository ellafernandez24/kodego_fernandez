package activity_03_b
import mu.KotlinLogging
import java.util.*
import kotlin.collections.ArrayList

private val logger = KotlinLogging.logger{}

var bookNames: ArrayList<String> = ArrayList()

fun main(){

//Create an ArrayList of bookname with 20 entries.
    bookNames.addAll(listOf("Unofficial Crimes", "Cursed Queen", "The New Days", "Signs of the Past",
        "The Two-Cent Men", "Aliens of a New Kind", "Dark New World", "Lost Warriors Of Elysium", "Eye of the Wolf",
        "Who Took My Book?", "The One After Mars", "Get Away And Run Away", "Time Ticks", "Miss Minnie And The Bees",
        "Quest Of The West", "Warrior Princess", "Blank Paper", "The Secrets Of Mr. Miller", "Homeless Heroes",
        "The Number"))

    isBookInRecord()
    addBook()
    removeBook()
    countBooks()
    searchBookWildSearch()
    searchBookName()
    showBooks()

}

//Create a function "isBookInRecord" that will accept a String and return true if the book is found, otherwise false.
fun isBookInRecord(){
    logger.info { "[SEARCH BOOK IN DIRECTORY]Input name of book: " }
    var givenBookName = readLine().toString()
    var found = false

    for (i in bookNames.indices){
        if(givenBookName.equals(bookNames[i], ignoreCase = true)) {
            found = true
            break
        }
    }

    if (found) {
        logger.info { "$givenBookName is in the school's records" }
    }
    else{
        logger.info { "$givenBookName is not in the school's records" }
    }

}

//Create a function "addBook" that will accept a String and add it to the ArrayList.
fun addBook(){
    logger.info { "[ADD BOOK IN DIRECTORY]Input name of book: " }
    var givenBookName = readLine().toString()
    bookNames.add(givenBookName)
}

//Create a function "removeBook"  that will accept a name and remove it from the ArrayList if it exactly matches the
// book name.
fun removeBook(){
    logger.info {" [REMOVE NAME IN DIRECTORY] Input name: " }
    var givenBookName = readLine().toString()
    bookNames.remove(givenBookName)
}

//Create a function "countBooks" that will return the size of the ArrayList.
fun countBooks(){
    logger.info { "Number of students in directory: ${bookNames.size}" }
}

//Create a function "searchBookWildSearch" that will accept a String and search if that string is found with in the
// ArrayList, it will return an ArrayList of books that matched if there are.
fun searchBookWildSearch(){

    var booknames: ArrayList<String> = ArrayList()

    logger.info { "[SEARCH NAME OF BOOK IN DIRECTORY]Input name: " }
    var givenBookName = readLine().toString()

    for (i in bookNames.indices){
        if(bookNames[i].contains(givenBookName, ignoreCase = true)) {
            booknames.add(bookNames[i])
        }
    }

    logger.info { "List of names found in the directory: $booknames" }

}

//Create a function  "searchBookName" that will accept a String and search if there is an exact match of the String
// input, it will return an ArrayList of books that matched if there are.
fun searchBookName(){

    var searchBookNames: ArrayList<String> = ArrayList()

    logger.info { "[SEARCH NAME OF BOOK IN DIRECTORY]Input name of book: " }
    var givenBookName = readLine().toString()
    var found = false

    for (i in bookNames.indices){
        if(givenBookName.equals(bookNames[i], ignoreCase = true)) {
            found = true
            searchBookNames.add(givenBookName)
            break
        }
    }

    logger.info { "List of names found in the directory: $searchBookNames " }

}

//Create a function "showBooks" that will print all the entries in the ArrayList.
fun showBooks(){

    logger.info { "LIST OF STUDENTS IN THE DIRECTORY: $bookNames" }
}