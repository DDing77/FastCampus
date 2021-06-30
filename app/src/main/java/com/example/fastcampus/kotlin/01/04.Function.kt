package com.example.fastcampus.kotlin.`01`

// 04. Function
// -함수
//      -어떤 input 을 넣어주면 어떤 output 나오는 것

// - 함수를 선언하는 방법
// fun 함수명 (변수명: 타입, 변수명: 타입 ...) : 반환형 {
//      함수 내용
//      return 반환값
// }

fun plus(first : Int, second : Int): Int {
    println(first)
    println(second)
    val result : Int = first + second
    println(result)
    return result
}

fun main(array: Array<String>) {
//    val result = plus(5, 10)
//    val result2 = plus(first = 20, second = 30)
    val result3 = plus(second = 100, first = 10 ) // 인수를 명시적으로 전달하는 방법
//    println(result)
//    println(result2)
    println(result3)
}