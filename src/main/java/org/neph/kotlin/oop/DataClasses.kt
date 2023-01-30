package org.neph.kotlin.oop

/**
@ Author NMuchiri
 **/

fun main(){

    // USER
    val user1 = User(1, "Nephat Mutugi")
    println(user1)
    val updatedUser = user1.copy(id = 2)
    println(updatedUser)

    println("Component 1 = ${updatedUser.component1()}" +
            "\nComponent 2 = ${updatedUser.component2()}")

    // deconstruction
    val (id, name) = updatedUser
    println("ID = $id, NAME = $name")


    // MOBILE PHONE
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}
data class User(val id: Long, val name: String)


class MobilePhone(osName: String, brand: String, model: String){

    private var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}