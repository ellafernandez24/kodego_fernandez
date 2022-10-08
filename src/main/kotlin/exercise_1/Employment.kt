package exercise_1

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){

    var workPosition = ""
    var dateTimeNow= LocalDateTime.now()
    var formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy")
    var formatted = dateTimeNow.format(formatter)
    var salary = ""
    var nameLast = ""
    var nameFirst = ""
    var nameMiddle = ""
    var address = ""
    var city = ""
    var state = ""
    var zip = ""
    var phoneNumber = ""
    var cellNumber = ""
    var emailAddress = ""
    var socialSecurityNumber = ""
    var birthDate = ""
    var schoolName1 = ""
    var schoolName2 = ""
    var location = ""
    var location2 = ""
    var yearAttended = ""
    var yearAttended2 = ""
    var degree = ""
    var degree2 = ""
    var major = ""
    var major2 = ""


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
