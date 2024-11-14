package com.jkweyu.kotlin_basic

class DataClass {
}
fun main(args: Array<String>) {
    val person1 = Persons("messi", 1987)
    val person2 = Persons("ronaldo", 1985)
    val person3= Persons("hazard", 1991)
    val person4= Persons("son", 1992)
    //equals()메서드
    println("equals()메서드 : ${person1.equals(person2)}")

    //hashCode()메서드
    println("hashCode()메서드 : ${person2.hashCode()}")

    //toString()메서드
    println("toString()메서드 : ${person3.toString()}")

    //copy()메서드
    val newPerson01 = person3.copy()
    println("copy()메서드 : ${newPerson01.toString()}")
    val newPerson02 = person4.copy("salah")
    println("copy()메서드 : ${newPerson02.toString()}")

    //componentN()
    println("componentN()메서드 : ${person4.component1()}")


}
data class Persons(val name: String, val age: Int)