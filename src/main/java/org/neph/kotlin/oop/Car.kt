package org.neph.kotlin.oop

import java.lang.IllegalArgumentException

/**
@ Author NMuchiri
 **/

fun main(){
    var myVal: Int = 10

    var maxSpeed = myVal.takeIf { it>0 } ?: throw IllegalArgumentException("Max Speed cannot be less than 0")
    println(maxSpeed)
}
class Car {

}