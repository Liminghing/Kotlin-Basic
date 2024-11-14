package com.jkweyu.kotlin_basic

class Loop {
}
fun main(args: Array<String>) {
    for (i in 1..5) {
        println("i의 값: $i")
    }
    println("------------")
    for (i in 1 until 5) {
        println("i의 값: $i")
    }
    println("------------")
    for (i in 5 downTo 1) {
        println("i의 값 (역순): $i")
    }
    println("------------")
    for (i in 1..10 step 2) {
        println("i의 값: $i")
    }
    println("------------")
    val items = listOf("사과", "바나나", "체리")
    for (item in items) {
        println(item)
    }
    println("------------")
    var count1 = 5
    while (count1 > 0) {
        println("카운트다운: $count1")
        count1--
    }
    println("------------")
    var count2 = 3
    do {
        println("카운트다운: $count2")
        count2--
    } while (count2 > 0)
}