package com.example.fastcampus.kotlin.`01`

// 08. 제어 흐름
// - if, else


fun main(array: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    if (a > b) {
        println("a 가 b 보다 크다")
    } else {
        println("a 가 b 보다 작다")
    }

    if (a > b) {
        println("a 가 b 보다 크다")
    }

    if (a > b) {
        println("a 가 b 보다 크다")
    } else if (a < b) {
        println("a 가 b 보다 작다")
    } else if (a == b) {
        println("a 가 b 보다 같다")
    } else {

    }

    // 값을 리턴하는 if 사용방법
    val max = if (a > b) a else b
    println()
    println(max)
}