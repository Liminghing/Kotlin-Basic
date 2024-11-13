package com.jkweyu.kotlin_basic
import kotlin.random.Random
class Operator {
}
fun main(args: Array<String>) {
    val a1 = 3 / 2
    val b1 = 3.0 / 2
    println("a : $a1")
    println("b : $b1")
    println("------------")
    var a = 5
    println(a)
    a += 5
    println(a)
    a *= 2
    println(a)
    a /= 2
    println(a)
    a %= 3
    println(a)
    println("------------")
    val num1 = Random.nextInt(10)
    val num2 = Random.nextInt(10)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 == num2)
    println(num1 != num2)
    println("------------")
    var q = 0
    var w = 0
    for(i in 1 until 10){
        println("q++ : ${q++}")
        println("++w : ${++w}")
        println("--")
    }
    println("------------")
    val logi1 = Random.nextInt(10)
    val logi2 = Random.nextInt(10)
    val logi3 = Random.nextInt(10)
    val logi4 = Random.nextInt(10)

    println("logi1 : $logi1, logi2 : $logi2, logi3 : $logi3, logi4 : $logi4")

    println(logi1 > logi2 && logi3 > logi4)
    println(!(logi1 > logi2))
}