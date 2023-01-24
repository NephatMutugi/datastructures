package org.neph.kotlin

import java.time.LocalDate

/**
@ Author NMuchiri
 **/

fun main(){
    var myName = "Nephat"
    myName += " Muchiri"
    val dateOfBirth = 1998
    val currentDate = LocalDate.now().year
    val age = currentDate - dateOfBirth
    println("$myName's age is $age Years.")

    /* TEST
    * Please write a program in which you are assigning those values to variables with the right (specific) data type:
    * */

    val testString = "Android Masterclass"
    val testFloat = 13.37F
    val testDouble = 3.14159265358979
    val testByte: Byte = 25
    val testInt = 2022
    val testLong: Long = 18881234567
    val testBoolean = true
    val testChar = 'a'

    println("VARIABLES DATA TYPES")
    println("=====================================================================\n")
    println("testString: " + testString::class.qualifiedName)
    println("testFloat: " + testFloat::class.qualifiedName)
    println("testDouble: " + testDouble::class.qualifiedName)
    println("testByte: " + testByte::class.qualifiedName)
    println("testInt: " + testInt::class.qualifiedName)
    println("testLong: " + testLong::class.qualifiedName)
    println("testBoolean: " + testBoolean::class.qualifiedName)
    println("testChar: " + testChar::class.qualifiedName)
    println("The length of my str is ${testString.length}")


    // ARITHMETICS
    var a = 35;
    val b = 8;

    val result: Double = a/b.toDouble()

    println("RESULT of $a/$b is: $result")
    println("My num is ${a++}")
    println("My num is ${++a}")
}
