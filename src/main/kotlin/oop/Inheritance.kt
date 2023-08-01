package oop

fun main() {
    val obj = Child()
    obj.name = "Husnain"
    obj.name2 = "Adeel"
    println("${obj.name} and ${obj.name2}")
    obj.myMethod()
    obj.myMethod2()
}

open class Parent {
    var name: String = ""
    fun myMethod() {
        println("I'm in parent class")
    }
}

class Child : Parent() {
    var name2: String = ""
    fun myMethod2() {
        println("I'm in child class")
    }
}