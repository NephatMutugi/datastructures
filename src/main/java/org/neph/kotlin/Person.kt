package org.neph.kotlin

/**
@ Author NMuchiri
 **/
class Person(firstName: String, lastName: String) {
    init {
        println("Initialized a new person object with " +
                "Firstname $firstName and lastname $lastName")
    }
}

fun main(){
    val neph = Person("Nephat", "Mutugi")
}