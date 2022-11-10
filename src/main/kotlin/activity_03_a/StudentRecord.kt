package activity_03_a
import mu.KotlinLogging
import java.util.*
import kotlin.collections.ArrayList

private val logger = KotlinLogging.logger{}

var studentNames: ArrayList<String> = ArrayList()

fun main(){

    studentNames.addAll(listOf("Jason", "Kurt", "Logan", "Monique", "Nickho", "Marco",
        "Sarah", "Chachi", "Mickaella", "Maria", "Rica", "Eugene", "Isaiah", "Anthony", "Henry", "Amparo", "Ricardo",
        "Michelle", "Lucy", "Michael"))

    isStudentInRecord()
    addStudent()
    removeStudent()
    countStudent()
    searchStudent()
    showStudents()

}

//Create a function "isStudentInRecord" that will accept a name and return true if the name is found, otherwise false.
fun isStudentInRecord(){
    logger.info { "[SEARCH NAME IN DIRECTORY]Input name: " }
    var givenName = readLine().toString()
    var found = false

    for (i in studentNames.indices){
        if(givenName.equals(studentNames[i], ignoreCase = true)) {
            found = true
            break
        }
    }

    if (found) {
        logger.info { "$givenName is in the school's records" }
    }
    else{
        logger.info { "$givenName is not in the school's records" }
    }

}

//Create a function "addStudent" that will accept a name and add it to the ArrayList.
fun addStudent(){
    logger.info { "[ADD NAME IN DIRECTORY]Input name: " }
    var givenName = readLine().toString()
    studentNames.add(givenName)
}

//Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.
fun removeStudent(){
    logger.info {" [REMOVE NAME IN DIRECTORY] Input name: " }
    var givenName = readLine().toString()
    studentNames.remove(givenName)
}

//Create a function "countStudent" that will return the size of the ArrayList.
fun countStudent(){
    logger.info { "Number of students in directory: ${studentNames.size}" }
}

//Create a function "searchStudentWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of names that matched if there are.
fun searchStudentWildSearch(){

    var searchStudentWildNameSearch: ArrayList<String> = ArrayList()

    logger.info { "Search name in directory:" }
    var givenName = readLine().toString()
    var index = 0



}
//Create a function  "searchStudentName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of names that matched if there are.
fun searchStudentName(){

    var searchStudentNames: ArrayList<String> = ArrayList()

    logger.info { "[SEARCH NAME IN DIRECTORY]Input name: " }
    var givenName = readLine().toString()
    var found = false

    for (i in studentNames.indices){
        if(givenName.equals(studentNames[i], ignoreCase = true)) {
            found = true
            searchStudentNames.add(givenName)
            break
        }
    }

    logger.info { "List of names found in the directory: $searchStudentNames " }

}
//Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if the String input is less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.
fun searchStudent(){

    logger.info { "[SEARCH NAME IN DIRECTORY]Input name: " }
    var givenName = readLine().toString()

    if(givenName.length <= 3){
        searchStudentWildSearch()
    }else{
        searchStudentName()
    }


}
//Create a function "showStudents" that will print all the entries in the ArrayList.
fun showStudents(){

    logger.info { "LIST OF STUDENTS IN THE DIRECTORY: $studentNames" }
}