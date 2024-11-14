package com.jkweyu.kotlin_basic

class Condition {
}
fun main(args: Array<String>) {
    val a = 10
    val b = 20

    // 기본적인 if 문
    if (a < b) {
        println("a는 b보다 작습니다")
    } else {
        println("a는 b보다 크거나 같습니다")
    }
    val x = 3

    val result = when (x) {
        1 -> "x는 1입니다"
        2 -> "x는 2입니다"
        3, 4 -> "x는 3 또는 4입니다"
        in 5..10 -> "x는 5 이상 10 이하입니다"
        else -> "x는 조건에 맞지 않습니다"
    }
    println(result)
}