package com.jkweyu.kotlin_basic

class HigherOrderFunction {
}
fun main() {
    val sum = calculate({ x, y -> x + y }, 3, 4) // 함수 인자로 넘기기
    println(sum) // 출력: 7
    val result = pow2(::calculate, 3)  //::를 사용해 calculate를 호출하지 않고 calculate를 참조만 해줌
    println(result)

    //val multiplyBy2: (Int) -> Int 인 함수
    val multiplyBy2 = multiplyBy(2) // multiplyBy 함수가 (Int) -> Int 형식의 함수를 반환
    println(multiplyBy2(5)) // 출력: 10
}
fun calculate(operation: (Int, Int) -> Int, a: Int, b: Int): Int {
    return operation(a, b)
} //함수인자 : operation: (Int, Int) -> Int

fun pow2(calculate: (operation: (Int, Int) -> Int, a: Int, b: Int) -> Int, x: Int): Int {
    return calculate({ num1, num2 -> num1 * num2 }, x, x)
}
fun multiplyBy(factor: Int): (Int) -> Int {
    return { number -> number * factor }
} //함수반환 : (Int) -> Int