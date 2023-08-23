package advance

fun main() {
    val lambda = { a: Int, b: Int -> a + b }
    val multiLineLambda = {
        val a = 5
        val b = 2;
        val result = a + b
        result
    }

    val l2: (Int) -> Int = { it + it }
    callMe(l2)
}

fun callMe(a: (Int) -> Int) {
    println(a(3))
}