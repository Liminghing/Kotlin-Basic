package com.jkweyu.kotlin_basic

class EnumClass {
}
fun main(args: Array<String>) {
    //name메서드
    val direction = Direction.NORTH
    //ordinal메서드
    println("${direction}의 순서 : ${direction.ordinal}")
    //values()
    val directions = Direction.values()
    directions.forEach { println(it) }  // 출력: NORTH, SOUTH, EAST, WEST
    //valueOf(name: String)
    println("${Direction.valueOf("WEST")}")
    println(Direction.valueOf("NORTH")) // 출력: NORTH

    val newDirection = newDirection.SOUTH
    newDirection.description()

}
enum class Direction {
    NORTH, SOUTH, EAST, WEST
}
enum class newDirection(val angle: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270);

    fun description(): String {
        return "Direction $name at $angle degrees"
    }
}