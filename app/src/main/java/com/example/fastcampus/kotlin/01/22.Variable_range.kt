package com.example.fastcampus.kotlin.`01`


// 변수의 접근 범위
// 1. 전역 변수
// 2. 지역 변수

// 전역 변수 설정은 작게헤야 좋다

var number100: Int = 10 // 전역 변수

fun main(args: Array<String>) {
    println(number100)

    val test = Test("홍길동")
    test.testFun()
    test.name
    println(number100)
}

class Test(var name : String ) { // 지역변수

    fun testFun() {
        var birth: String = "2000/3/1"
        name = "홍길동"
        number100 = 100
        fun testFun2(){
            var gender: String = "male"
        }
    }

    fun testFun2(){

    }

}