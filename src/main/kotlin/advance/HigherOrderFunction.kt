package advance

fun main() {
    doSomething(true,
        { value ->
            println(value)
        },
        {
            println(false)
        }
    )
    calculator(1,2,::sum)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun calculator(a: Int, b: Int, fn: (Int, Int) -> Int) {
    println(fn(a, b))
}
fun doSomething(condition: Boolean, a: (Int) -> Unit, b: () -> Unit) {
    if (condition) {
        a(4)
    } else {
        b()
    }
}
