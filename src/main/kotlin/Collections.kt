fun main() {
    grouping()
}

fun filterAndTransform() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    //Filter even numbers
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even Numbers are $evenNumbers")

    //Transform each number into it's square
    val squareNumbers = numbers.map { it * it }
    println("Before Square $numbers")
    println("Square of numbers are $squareNumbers")
}

fun sorting() {
    val fruits = listOf("Banana", "Apple", "Orange")
    //Sorting
    println("Natural = ${fruits.sorted()}")
    //Descending
    println("Descending = ${fruits.sortedDescending()}")
    //By length
    println("By length = ${fruits.sortedBy { it.length }}")
}

fun grouping() {
    val words = listOf("apple", "banana", "orange", "avocado", "grape")
    println(words.groupBy { it.first().uppercase() })
}

class Transformation {
    companion object {
        fun mapping() {
            val personList = listOf<Person>(
                Person(1, "Husnain"),
                Person(2, "Danish"),
                Person(3, "Danial")
            )
            println(personList
                .filter { it.name.startsWith("D") }
                .map { it.name }
            )
        }

        fun zipping() {
            val numbers = listOf("One", "Two", "Three", "four")
            val integers = listOf(1, 2, 3, 4)

            val zippedList = numbers.zip(integers) { a, b ->
                "$a = $b"
            }
            println(zippedList)

            val companies = listOf(
                "Apple" to 1, "Google" to 2,
                "Amazon" to 3, "Facebook" to 4
            )
            println(companies.unzip())
        }

        fun association() {
            val captains = listOf("Kohli", "Root", "Smith", "Williamson", "Root")
            println(captains.associateWith { it.length })
        }

        fun flattening() {
            val listForFlattening = arrayListOf(
                listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9)
            )
            val flattenedList = listForFlattening.flatten()
            println(flattenedList)
        }

        fun stringRepresentation() {
            val colors = arrayListOf("Red", "Blue", "Black", "Yellow")
            println(colors.joinToString())
        }
    }
}

data class Person(val id: Int, val name: String)
