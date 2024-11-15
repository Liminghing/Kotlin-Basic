package com.jkweyu.kotlin_basic

class AbstractClass {
}
fun main(args: Array<String>) {
    val manager = Manager("Buddy")
    val engineer = Engineer("Kitty")

    manager.makeMoney()
    engineer.makeMoney()
    manager.work()
    engineer.work()
}
// 추상 클래스 정의
abstract class Employee(val name: String) {

    // 추상 메서드: 각 동물마다 다른 소리를 내므로 구현을 생략
    abstract fun makeMoney()

    // 구체적 메서드: 모든 동물이 동일하게 잠을 자기 때문에 구현을 제공
    fun work() {
        println("$name is working.")
    }
}

// 추상 클래스를 상속받은 Dog 클래스
class Manager(name: String) : Employee(name) {
    override fun makeMoney() {
        println("$name make 100$")
    }
}

// 추상 클래스를 상속받은 Cat 클래스
class Engineer(name: String) : Employee(name) {
    override fun makeMoney() {
        println("$name make 200$")
    }
}

