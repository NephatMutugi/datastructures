package org.neph.kotlin

/**
@ Author NMuchiri
 **/

fun main(){
    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result /= 2
    // alternatively
    // result /= 2
    result *= 5
    result -= 1
    var moduloResult = 5%2
    println( moduloResult)
    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("isEqual is $isEqual")
    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")


    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")

    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")
}