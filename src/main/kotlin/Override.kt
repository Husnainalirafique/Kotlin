fun main() {
    val obj1 = OnePlus()
    obj1.display()
    println(obj1.toString())
}

open class Mobile() {
    open val name: String = ""
    open val size: Int = 5
    fun makeCall() = println("Calling From Mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class OnePlus : Mobile() {
    override val name: String = "One Plus"
    override val size: Int = 6
    override fun display() {
        super.display()
        println("OnePlus Display")
    }

    override fun toString(): String {
        return "OnePlus(name='$name', size=$size)"
    }


}