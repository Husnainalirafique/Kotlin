package oop

fun main() {
    var obj = Person("Husnain")
    obj.name = "Danish"
}

class Person(name: String, age: Int = 0) {
    var name = name
        set(value) {
            if (value.contains("H",true))
            {
                field = value
            }
            else{
                print("name is incorrect")
            } 
        }
}