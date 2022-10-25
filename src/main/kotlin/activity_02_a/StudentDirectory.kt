//Implement Activity 01 -  A using data structure.
package activity_02_a
import java.time.format.DateTimeFormatter

    //STUDENT DIRECTORY

    var birthDate = DateTimeFormatter.ofPattern("dd-MMMM-yyyy")
    var studentID: ArrayList<Long> = ArrayList()
    var firstName: ArrayList<String> = ArrayList()
    var middleName:ArrayList<String> = ArrayList()
    var lastName: ArrayList<String> = ArrayList()
    var address: ArrayList<String> = ArrayList()
    var city: ArrayList<String> = ArrayList()
    var province: ArrayList<String> = ArrayList()
    var zipCode: ArrayList<Int> = ArrayList()
    var studentYear: ArrayList<Int> = ArrayList()
    var studentSection: ArrayList<Char> = ArrayList()
    var emailAddress: ArrayList<String> = ArrayList()
    var telephoneNumber: ArrayList<String> = ArrayList()
    var mobileNumber: ArrayList<String> = ArrayList()

    //PROGRESS OF THE STUDENT

    var isStudentPresent:Boolean? = null
    var isStudentAbsent:Boolean? = null
    var studentGrade: ArrayList<String> = ArrayList()

