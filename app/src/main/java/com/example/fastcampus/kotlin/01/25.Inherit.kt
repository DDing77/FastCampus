package com.example.fastcampus.kotlin.`01`

// 두번가지는 봐준다
// 두번 이상이 넘어감녀 리펙토링 해라

// 25. 상속
// 부모로부터 설명서를 물려받는다!

fun main(args: Array<String>) {
    val superCar100 : SuperCar100 = SuperCar100()
    superCar100.dirve()
    superCar100.stop()

    val bus100 : Bus100 = Bus100()
//    bus100.drive()

}
// engine: String, body: String
// 클래스는 private이 기본

// 부모 : Car100
// 자식 : SuperCar100 , Bus100
open class Car100() {
    fun dirve() {

    }

    fun stop() {

    }
}

class SuperCar100() : Car100() {


    fun driveFast() {

    }
}


class Bus100()  {

}