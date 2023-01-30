package org.neph.kotlin.oop

/**
@ Author NMuchiri
 **/

interface Drivable{
    val maxSpeed: Double
    fun drive(): String

    fun brake(){
        println("The drivable is breaking")
    }
}
