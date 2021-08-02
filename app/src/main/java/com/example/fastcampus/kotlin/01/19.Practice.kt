package com.example.fastcampus.kotlin.`01`

fun main(args: Array<String>) {
    val calculator1 = Calculator1()
    println(calculator1.plus(4, 5))
    println(calculator1.minus(4, 5))
    println(calculator1.multiply(4, 5))
    println(calculator1.divide(4, 5))

    println()

    val calculator2 = Calculator2()
    println(calculator2.plus(1,2,3,4,5))
    println(calculator2.minus(10,1,2,3))
    println(calculator2.multiply(1,2,3))
    println(calculator2.divide(10,2,3))

}

class Calculator1() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 뒤에 들어온 수를 뺀다
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 뒤에 들어온 수를 나눈다
        // 리턴은 몫만 한다
        return a / b
    }
}

class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 0 until numbers.size) {
            if( i !=0){
                result = result - numbers[i]
            }
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (index != 0 && value != 0) {
                result = result / value
            }
        }
        return result
    }
}
//
//    class Calculator(number1: Int, number2: Int) {
//        var operator: String = ""
//
//        constructor(number1: Int, number2: Int, operator: String) : this(number1, number2) {
//            this.operator = operator
//        }
//
//    }
