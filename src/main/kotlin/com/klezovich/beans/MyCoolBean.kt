package com.klezovich.beans

class MyCoolBean(
    val message:String = "Default Hello"
) {

    fun msg(): String {
        return message
    }
}