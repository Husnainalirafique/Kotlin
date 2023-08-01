fun main() {
    val day = Day.Sunday
    day.display()

    var userType : UserType? = null
    userType = UserType.Admin

    when (userType) {
        UserType.Admin -> { TODO() }

        UserType.Regular -> { TODO() }
    }
}

enum class UserType{
    Regular,
    Admin
}

enum class Day(val n: Int) {
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);

    fun display() {
        println("Day is $this")
    }
}