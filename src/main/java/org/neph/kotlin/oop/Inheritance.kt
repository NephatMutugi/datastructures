package org.neph.kotlin.oop

/**
@ Author NMuchiri
 **/

// Super class, parent class, or base class
// This needs to be open in order to be inherited
//open class Vehicle(){
//
//}

// subclass or derived class of Vehicle
open class Car(val name: String, val brand: String,
               override val maxSpeed: Double) : Drivable {
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0){
            range += amount
        }
    }

    open fun drive(distance: Double){
        println("Drove for $distance KMS")
    }

    override fun drive(): String {
        return "Driving the interface"
    }

}

class ElectricCar(name: String, brand: String, batteryLife: Double, maxSpeed: Double) : Car(name, brand, maxSpeed) {
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        super.drive(distance)
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String {
        println("$brand $name Drove for $range KM on electricity")
        return "Drive Electric Car"
    }
}

fun main() {
    val audiA3 = Car("A3", "Audi", 300.0)
    val teslaS = ElectricCar("S", "Tesla", 85.0, 300.0)

    teslaS.extendRange(150.0)
    audiA3.drive(200.0)
    teslaS.drive()
    teslaS.brake()
}


