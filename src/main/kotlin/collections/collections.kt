package collections

fun main() {
//    val items = listOf(
//        "Husnain",
//        "Adeel",
//        "Ali",
//        "Alia",
//        "Usama"
//    )
//    print(items.filter { it.startsWith("a",true)})

    // # Lambda Expression
    val add = { a: Int, b: Int -> a + b }
    println(add(2,3))

    val sum:(Int,Int) -> Int = {a,b -> a+b}

    println(sum(3,4))
}