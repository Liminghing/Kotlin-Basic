package com.jkweyu.kotlin_basic

class LambdaFunction {
}
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = filter(numbers,{ it % 2 == 0 }) // 람다 함수를 인자로 전달
    //람다 표현식이 마지막 매개변수인 경우 코틀린의 문법적 편의
    //val evenNumbers = filter(numbers) { it % 2 == 0 }
    println(evenNumbers)  // 출력: [2, 4, 6]
}
//"condition: (Int) -> Boolean"부분이 람다식으로 표현
fun filter(list: List<Int>, condition: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (item in list) {
        if (condition(item)) {
            result.add(item)
        }
    }
    return result
}

