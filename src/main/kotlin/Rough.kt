fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf("a", "b", "c")

    val zippedList = list1.zip(list2) { n, l ->
        "$n$l"
    }
    println(zippedList)

}