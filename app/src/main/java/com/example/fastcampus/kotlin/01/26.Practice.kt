package com.example.fastcampus.kotlin.`01`


// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다.
// - 부모 클래스는 자식 클래스의 타입이 아니다!
fun main(args: Array<String>) {

    val monster = SuperMonster(100,10)
    val knight = SuperKnight(130,8)
    monster.attack(knight)
    monster.bite(knight)

}

//class Knight2(private var hp: Int, private var power: Int) {
//
//    fun attack(monster: Monster2) {
//
//    }
//
//    fun defense() {
//
//    }
//}
//
//open class Monster2(private var hp: Int, private var power: Int) {
//    open fun attack() {
//
//    }
//
//    fun defense() {
//
//    }
//}

open class Charator(var hp: Int, var power: Int) {
    fun attack(charator: Charator, power: Int = this.power) {
        charator.defense(power)
    }

    open fun defense(damage:Int) {
        hp -= damage
        if(hp > 0) println("${javaClass.simpleName}남은 체력 $hp") //  클래스의 이름을 리턴 받고 싶으면 javaclass.simpleName사용
        else println("사망 했습니다.")
    }
}

// 자식 클래스가 인스턴스화 되기 위해서 부모 클래스가 선행되서 인스턴스화 되어야 한다.
// 상속받은 자식의 파라미터에는 var,val 등을 넣지 않는다, 부모에서 이미 선언 되어있기 때문에
class SuperMonster(hp: Int, power: Int) : Charator(hp, power) {
    fun bite(charator: Charator) {
        super.attack(charator, power + 2)
    }
}

class SuperKnight(hp: Int, power: Int) : Charator(hp, power) {
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}