package com.jkweyu.kotlin_basic

class Inheritance {
}
fun main(args: Array<String>) {
    var dog01 = Dog("001")
    dog01.sound()
    var dog02 = Dog("002")
    dog02.sound()
    var dog03 = Dog("003")
    dog03.sound()

    var cat01 = Cat("010")
    cat01.sound()
    var cat02 = Cat("020")
    cat02.sound()
    var cat03 = Cat("030")
    cat03.sound()


}
open class Animal(val name: String) {
    open fun sound() {
        println("Some sound")
    }
}
class Dog(name: String) : Animal(name) {
    override fun sound() { //override 키워드를 사용해 부모클래스의 메서드 수정사용
        println("$name : Bark")
    }
}
class Cat(name: String) : Animal(name) {
    override fun sound() { //override 키워드를 사용해 부모클래스의 메서드 수정사용
        super.sound()
        println("meow")
    }
}