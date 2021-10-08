package com.klezovich.oop

import java.util.*

fun main() {
    println(Person().firstName)

    println(Car("BMW502"))
}

class Car {

    private val make:String
    private val model:String

    constructor(s:String) {
        this.make=s.substring(0,3)
        this.model=s.substring(4,6)
    }

    override fun toString(): String {
        return "Car(make='$make', model='$model')"
    }
}


class Person(firstName: String = "AA", lName: String = "KK") {

    val firstName: String
    var lastName: String

    init {
        this.firstName = firstName.uppercase(Locale.getDefault())
        this.lastName = lName
    }
}

class Lamp {
    private var isOn: Boolean = false

    fun turnOn() {
        isOn=true
    }

    fun turnOff() {
        isOn=false
    }

    override fun toString(): String {
        return "Lamp(isOn=$isOn)"
    }
}

class Oop {
}