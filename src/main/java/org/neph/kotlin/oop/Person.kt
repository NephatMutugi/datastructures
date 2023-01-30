package org.neph.kotlin.oop

/**
@ Author NMuchiri
 **/

// This is a primary constructor
class Person(firstName: String, lastName: String) {

    private var firstName: String? = null
    private var lastName: String? = null

    init {
        this.firstName = firstName
        this.lastName = lastName
        println(
            "Initialized a new person object with " +
                    "Firstname $firstName and lastname $lastName"
        )
    }

    var birthDate: Int? = null

    // Secondary/ member constructor
    constructor(firstName: String, lastName: String, birthDate: Int) : this(firstName, lastName) {
        this.birthDate = birthDate
    }

    var hobby = "Write Code"
    fun stateHobby(birthDate: Int) {
        println("My hobby is to $hobby")
        println("${this.firstName} ${this.lastName} is ${(2023 - birthDate)} years old")
    }

    fun calculateAge(currentYear: Int) {
        println("${this.firstName} ${this.lastName} is ${currentYear - this.birthDate!!} years!!")
    }
}

fun main() {
    val neph = Person("Nephat", "Mutugi")
    neph.hobby = "watch netflix"
    neph.birthDate = 1998
    neph.stateHobby(1998)

    val curry = Person("Steph", "Curry", 1988)
    curry.calculateAge(2023)
}
