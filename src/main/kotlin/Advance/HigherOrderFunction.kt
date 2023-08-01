fun main() {
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun calculator(a: Int, b: Int, fn: (Int, Int) -> Int) {
    println(fn(a, b))
}

