//You are tasked to create a directory of the students taking this course.
//The data will be used to send updates regarding the classes.
//There is also a need to know the progress of the students during the progress of this course.
//List down all data that can be used to implement this. Use the proper data types.

package activity_01_a
import java.time.format.DateTimeFormatter

fun main(){

    //STUDENT DIRECTORY

    var studentID:Long? = null
    var firstName:String? = null
    var middleName:String? = null
    var lastName:String? = null
    var birthDate = DateTimeFormatter.ofPattern("dd-MMMM-yyyy")
    var address:String? = null
    var city:String? = null
    var province:String? = null
    var zipCode:Int? = null
    var studentYear:Int? = null
    var studentSection:Char? = null
    var emailAddress:String? = null
    var telephoneNumber:String? = null
    var mobileNumber:String? = null

    //PROGRESS OF THE STUDENT

    var isStudentPresent:Boolean? = null
    var isStudentAbsent:Boolean? = null
    var studentGrade:Double? = null

}

