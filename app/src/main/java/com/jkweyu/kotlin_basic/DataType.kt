package com.jkweyu.kotlin_basic

class DataType {
}

fun main(args: Array<String>) {

    val number1 = 1000
    val number2 = 1000L
    val number3 = -123
    var number4: Any = 123
    var number5 = 123.456
    var number6: Double = 123.456
    var number7: Float = 123.456F

    val isTrue = true
    val isFalse: Boolean = false
    number4 = false

    // Character, String Data Type
    val character = 'a'
    println(character)
    println(character + 1)

    val string1 = "string1"
    val string2: Any = "string2"
    number4 = "number4"
}