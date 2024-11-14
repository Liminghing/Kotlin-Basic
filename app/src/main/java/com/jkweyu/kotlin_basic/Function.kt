package com.jkweyu.kotlin_basic

class Function {
}
fun main(args: Array<String>) {
    println("${func0(10,3.14)}")
    println("${func1(11,3.14)}")
    func2(30,4.5)
    func3(num2 = 5.5, num1 = 20)
    func4(50)
}
fun func0(num1: Int, num2: Double): Double {
    return num1 + num2
}
fun func1(num1: Int, num2: Double) = num1 + num2
fun func2(num1: Int, num2: Double) {
    println("$num1,$num2")
}
fun func3(num1: Int, num2: Double): Unit{
    println("$num1,$num2")
}
fun func4(num1: Int, num2: Double = 3.14) {
    println("$num1,$num2")
}