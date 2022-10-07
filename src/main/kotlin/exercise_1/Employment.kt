package exercise_1

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){

    var workPosition = "Mobile Developer"
    var dateTimeNow= LocalDateTime.now()
    var formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy")
    var formatted = dateTimeNow.format(formatter)
    var salary = "P25,000"
    var nameLast = "Fernandez"
    var nameFirst = "Mickaella"
    var nameMiddle = "Cabrera"
    var address = "Juliana"
    var city = "Pampanga"
    var state = "San Fernando"
    var zip = "2000"
    var phoneNumber = "9612345"
    var cellNumber = "09182386571"
    var emailAddress = "ellacabrera1205@gmail.com"
    var socialSecurityNumber = "34-5829169-8"
    var birthDate = "October 24, 1991"
    var schoolName1 = "UST"
    var schoolName2 = "AUF"
    var location = "Manila"
    var location2 = "Pampanga"
    var yearAttended = "2008-2012"
    var yearAttended2 = "2013-2017"
    var degree = "Bachelor of Science"
    var degree2 = "Juris Doctor"
    var major = "IT"
    var major2 = "Law"


    println("                                       Application for Employment       ")
    println("Position You Are Applying For: $workPosition                      Desired Salary: $salary")
    println("Date Available for Work: $formatted")
    println("____________________________________________________________________________________________________________")
    println("|PERSONAL INFORMATION                                                                                       |")
    println("____________________________________________________________________________________________________________")
    println("|      $nameLast                            $nameFirst                             $nameMiddle                   |")
    println("|-----------------------             -----------------------                 -----------------              |")
    println("|     Last Name                             First Name                            Middle                    |")
    println("|                                                                                                           |")
    println("|       $address                  $city             $state                   $zip                   |")
    println("|_______________________    ____________________   __________________         ____________________          |")
    println("|       Address                    City                  State                         Zip                  |")
    println("|                                                                                                           |")
    println("|Home Phone: $phoneNumber        Cell Phone: $cellNumber        Email address: $emailAddress         |")
    println("|                                                                                                           |")
    println("|Social Security Number: $socialSecurityNumber    Birthdate: $birthDate                                        |")
    println("|                                                                                                           |")
    println("|Are you a U.S. Citizen?      [ ]Yes  [*]No                                                                 |")
    println("|                                                                                                           |")
    println("|Have you even been convicted of felony?           [ ]Yes  [*]No                                            |")
    println("|                                                                                                           |")
    println("|If selected for employment are you willing to submit to a pre-employment drug screening test? [*]Yes [ ]No |")
    println("|___________________________________________________________________________________________________________|")
    println("\n____________________________________________________________________________________________________________")
    println("|EDUCATION                                                                                                  |")
    println("____________________________________________________________________________________________________________")
    println("|     School Name     |     Location     |   Years Attended   |         Degree Received        |    Major   |")
    println("|___________________________________________________________________________________________________________|")
    println("|          $schoolName2        |     $location2     |     $yearAttended2      |           $degree2         |     $major2    |")
    println("|___________________________________________________________________________________________________________|")
    println("|          $schoolName1        |      $location      |     $yearAttended      |      $degree       |     $major     |")
    println("|___________________________________________________________________________________________________________|")
    println("|                     |                  |                    |                                |            |")
    println("|___________________________________________________________________________________________________________|")







}
