package com.jkweyu.kotlin_basic

class Interface {
}
fun main() {
    val user = User("Alice", 30) // User 클래스에서 값을 제공하고 객체 생성
    user.eat()		  // 클래스에서는 해당 메서드를 오버라이드하지 않고 사용
    println(user.name)  // getter가 호출됨
    println(user.age)   // getter가 호출됨
    user.age = 31       // setter가 호출되어 age 값 변경
    println(user.age)   // 31
}
interface UserInterface {
    val name: String  // 인터페이스에서 속성 선언
    var age: Int      // 인터페이스에서 속성 선언
}

interface Eatable {
    fun eat() {
        println("Eating...")
    }
}

class User(override val name: String, override var age: Int) : UserInterface,Eatable {
    // User 클래스에서 실제 값을 제공하는 부분
}

