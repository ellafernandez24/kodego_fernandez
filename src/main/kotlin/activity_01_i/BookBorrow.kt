//Using Activity 01 - B, Implement a process where someone can borrow a book.
//User: Librarian
//Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
package activity_01_i
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main() {

  var listOfBooks: ArrayList<String> = ArrayList()
  var namesOfBorrower: ArrayList<String> = ArrayList()
  var borrowDuration: ArrayList<String> = ArrayList()
  var yesOrNo: String? = null

    do{

      logger.info { "Book borrowed:" }
      var enterBook = readLine().toString()
      listOfBooks.add(enterBook)

      logger.info { "Name of borrower:" }
      var enterBorrower = readLine().toString()
      namesOfBorrower.add(enterBorrower)

      logger.info { "Duration to borrow the book:" }
      var bookDuration = readLine().toString()
      borrowDuration.add(bookDuration)

      logger.info { "List another book borrowed?[Y/N]" }
      yesOrNo = readLine().toString()
      if(yesOrNo.lowercase() == "n"){
        break
      }

    }while (yesOrNo == "y" || yesOrNo == "Y")


        logger.info {"${listOfBooks}, ${namesOfBorrower}, ${borrowDuration}\n"}







}