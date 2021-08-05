package com.example.fastcampus.kotlin.`01`

fun main(args: Array<String>) {
    val channels = listOf<String>("K","M","S")
    val tv = TV(channels)
    tv.switch()
    println(tv.onOrOff)
    tv.switch()
    println(tv.onOrOff)

    tv.channelUp()
    println(tv.checkCurrentChannel())

    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
}

class TV(val channels: List<String>) {

    var onOrOff : Boolean = false
    var curnnentChannelNumber = 0
        set(value) {
            field = value
            if (field > 2) {
                field = 0
            }
            if ( field < 0) {
                field = 2
            }
        }
        get() {
            println("호출되었습니다")
            return field
        }
    // 값의 할당
    // a = b

    fun switch() {
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel() : String{
        return channels[curnnentChannelNumber]
    }

    fun channelUp() {
        curnnentChannelNumber += 1
//        channels.forEachIndexed{ index, value ->
//            if(curnnentChannelNumber == index) {
//                curnnentChannelNumber += 1
//                return
//            }
//        }
    }

    fun channelDown() {
        curnnentChannelNumber -= 1
//        channels.forEachIndexed { index, value ->
//            if(curnnentChannelNumber == index){
//                curnnentChannelNumber -= 1
//                return
//            }
//        }
    }
}