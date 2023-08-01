fun main() {
    val numbers = listOf(5, 2, 8, 3, 1, 7)
    val maxNumber = numbers.reduce { acc, num ->
        if (num > acc) num else acc
    }
    println("Maximum number: $maxNumber") // Output: Maximum number: 8
}