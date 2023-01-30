package org.neph.kotlin.oop

/**
@ Author NMuchiri
 **/

data class User(val id: Long, val name: String)

fun main(){
    val user1 = User(1, "Nephat Mutugi")
    println(user1)

    val updatedUser = user1.copy(id = 2)
    println(updatedUser)

    println("Component 1 = ${updatedUser.component1()}" +
            "\nComponent 2 = ${updatedUser.component2()}")

    // deconstruction
    val (id, name) = updatedUser
    println("ID = $id, NAME = $name")
}