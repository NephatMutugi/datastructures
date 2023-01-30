package org.neph.kotlin.oop

/**
@ Author NMuchiri
 **/

fun main() {
    val myCar = Car()
    myCar.maxSpeed = 120
    myCar.distance = 500
    val timeTaken = myCar.timeTaken()
    println("Time taken to travel: ${myCar.distance} using a car of max speed: ${myCar.maxSpeed} is: $timeTaken.")

}

class Car {
    var maxSpeed: Int = 0
    var distance: Int = 0

    fun timeTaken(): Double {
        return distance.toDouble() / maxSpeed.toDouble()
    }
}