package com.example.fastcampus.kotlin.`01`

var a : Int = 10
var b = "1"
var c = b.toInt()
var d = b.toFloat()
var e = "John"
var f = "My name is $e Nice to meet you"

// Null
// - 존재 하지 않는다.

//var abc : Int = null
var abc1 : Int? = null // "null" (x)
var abc2 : Double? = null

var g = a + 3

fun main(array : Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
    println(g)
}