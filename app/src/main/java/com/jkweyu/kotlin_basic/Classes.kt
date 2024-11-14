package com.jkweyu.kotlin_basic

class Classes {
}
fun main(args: Array<String>) {
    var person01 = Person("messi")
    println("============================")
    var person02 = Person("ronaldo",1985)
    println("============================")
    var person03 = Person("hazard",1991,10)
    println("============================")
    var person04 = Person("son")
}

class Person(var name: String, val birthYear: Int,var grade : Int) { //주 생성자
    init {
        println("${this.birthYear}년생 ${this.grade}학년 ${this.name}님이 생성되었습니다.")
    }

    // 보조 생성자 1 (name만 전달받고, birthYear는 기본값 1997 사용)
    constructor(name: String) : this(name,1997,1) {
        println("보조 생성자 1 호출됨")
    }

    // 보조 생성자 2 (name과 birthYear 모두 전달받음)
    constructor(name: String, birthYear: Int) : this(name, birthYear,1) {
        println("보조 생성자 2 호출됨")
    }
}