package org.neph.kotlin

import java.time.LocalDate

/**
@ Author NMuchiri
 **/

fun main(){
    var myName = "Nephat"
    myName += " Muchiri"

    val dateOfBirth = 1998;
    val currentDate = LocalDate.now().year;

    val age = currentDate - dateOfBirth;

    println("$myName's age is $age Years.")
}



// var - variable
// val - constants