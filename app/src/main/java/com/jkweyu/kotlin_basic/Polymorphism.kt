package com.jkweyu.kotlin_basic

class Polymorphism {
}
fun main(args: Array<String>) {

    val myVehicle1: Vehicle = Car("tesla")
    val myVehicle2: Vehicle = Motorcycle("honda")


    myVehicle1.model()
    myVehicle2.model()
}
open class Vehicle(val name: String) {
    open fun model() {
        println("Vehicle's model")
    }
}

class Car(name: String) : Vehicle(name) {
    override fun model() {
        println("$name has four wheels. ")
    }
}

class Motorcycle(name: String) : Vehicle(name) {
    override fun model() {
        println("$name has two wheels.")
    }
}