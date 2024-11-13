package com.jkweyu.kotlin_basic

class Variable {
}
fun main(args: Array<String>) {
    val name: String = "abcd"
    val org = "abcdef"
    var num : Any = 10
    num = 2147483647
    num = 2147483648

    println("name is $name")
    println("org is $org")
    println("num is $num")
}