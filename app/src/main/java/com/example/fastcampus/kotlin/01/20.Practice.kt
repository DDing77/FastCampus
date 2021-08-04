package com.example.fastcampus.kotlin.`01`

fun main(args: Array<String>) {
    val account = Account("홍길동", "1997/06/05", 1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()
    val account2 = Account2("김철수", "1997/05/05", -2000)
    println(account2.checkBalance())

    println()
    val account3 = Account3("맹구", "1997/06/08")
    println(account3.checkBalance())
}

class Account(val name: String, val birth: String, var balance: Int) {

    init {
        println("$name($birth)님의 계좌가 신설되었습니다")
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}
//    var name: String
//    var birthday: String
//
//    constructor(name: String, birthday: String) {
//        this.name = name
//        this.birthday = birthday
//    }

class Account2 {

    var name: String
    var birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 0
        }
    }

//    init {
//        println("$this.name($this.birth)님의 계좌가 신설되었습니다")
//    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account3( val name: String, val birth:String, var balance : Int = 1000) {

    init {
        println("$name($birth)님의 계좌가 신설되었습니다")
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account4(initialBalance :Int) {

    val balance : Int = if (initialBalance >= 0) initialBalance else 0

    fun checkBalance():Int {
        return balance
    }


}