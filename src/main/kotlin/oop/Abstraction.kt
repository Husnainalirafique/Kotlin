package oop

fun main() {
    val one = Person1()
    one.name()
    val second = Person2()
    second.name()
}

abstract class About {
    abstract fun name()
}

class Person1 : About() {
    override fun name() {
        println("From new")
    }
}

class Person2 : About() {
    override fun name() {
        println("From me")
    }
}