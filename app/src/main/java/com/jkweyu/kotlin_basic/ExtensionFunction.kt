package com.jkweyu.kotlin_basic

class ExtensionFunction {
}
fun main() {
    val str = "hello"
    println(str.lastChar())  // 해당 인스턴스에서 마치 기존의 메서드처럼 호출
    println()
    str.printf()
}
fun String.lastChar(): Char { //String 클래스에 lastChar()라는 확장 함수를 추가
    return this[this.length - 1]  // 'this'는 확장 대상인 String 객체를 참조
}

fun String.printf() { //String 클래스에 lastChar()라는 확장 함수를 추가
    var i = this.length
    for(i in 0 until this.length ){
        println(this[i])
    }
}