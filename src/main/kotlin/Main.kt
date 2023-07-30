fun main() {
    var pizza1 = Pizza.createPizza("Meat")
    println(pizza1)
}

class Pizza(val type: String, val toppings: String) {
    companion object Factory {
        fun createPizza(pizzaType: String): Pizza {
            return when (pizzaType) {
                "Tomato" -> Pizza("Tomato", "tomato,cheese")
                "Meat" -> Pizza("Meat", "meat,cheese")
                else -> Pizza("Basic", "Onion,cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(Types=$type, toppings = $toppings)"
    }
}