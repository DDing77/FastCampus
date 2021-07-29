package com.example.fastcampus.kotlin.`01`

fun main(args: Array<String>) {
    first()
    println(second(80))
    println(third(89))
    gugudan()
}

fun first() {
    var firstList = mutableListOf<Int>()
    var secondList = mutableListOf<Boolean>()
    val size = 9
    for (item in 1..9) {
        firstList.add(item);
    }
    for (item in firstList) {
        if (item % 2 == 1) {
            secondList.add(false)
        } else {
            secondList.add(true)
        }
    }

    println(firstList)
    println(secondList)
}

fun second(score: Int): String {
    if( score >= 80) return "A"
    else if ( score >=70 ) return "B"
    else if ( score >=60) return "C"
    else return "F"
}

fun third(number:Int) :Int {
    var a = number/10
    var b = number%10
    var c = a + b
    return c
}

fun gugudan() {
    for ( i in 1 .. 9 ) {
        for ( j in 1 .. 9) {
            println( "$i x $j = ${i*j}")
        }
    }
}