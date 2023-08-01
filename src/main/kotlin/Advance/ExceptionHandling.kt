import java.lang.IllegalArgumentException

fun main() {
    val str:String? = null



    val len = str?.length ?: throw IllegalArgumentException()
}

fun abstractException(message:String) :Nothing{
    throw IndexOutOfBoundsException(message)
}