
package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val water = 400
    val milk = 540
    val beans = 120
    val cups = 9
    val money = 550

    println("""
        The coffee machine has:
        400 ml of water
        540 ml of milk
        120 g of coffee beans
        9 disposable cups
        $550 of money
      
        Write action (buy, fill, take):
        """.trimIndent())

    when (scanner.nextLine()) {
        "buy" -> {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
            when (scanner.nextInt()) {
                1 -> println("The coffee machine has:\n" +
                    "${water - 250} ml of water\n" +
                    "$milk ml of milk\n" +
                    "${beans - 16} g of coffee beans\n" +
                    "${cups - 1} disposable cups\n" +
                    "${money + 4} of money")

                2 -> println("The coffee machine has:\n" +
                    "${water - 350} ml of water\n" +
                    "${milk - 75} ml of milk\n" +
                    "${beans - 20} g of coffee beans\n" +
                    "${cups - 1} disposable cups\n" +
                    "${money + 7} of money")

                3 -> println("The coffee machine has:\n" +
                    "${water - 200} ml of water\n" +
                    "${milk - 100} ml of milk\n" +
                    "${beans - 12} g of coffee beans\n" +
                    "${cups - 1} disposable cups\n" +
                    "${money + 6} of money")
            }
        }

        "fill" -> {
            println("Write how many ml of water you want to add:")
            val waterAdd = scanner.nextInt()
            println("Write how many ml of milk you want to add: ")
            val milkAdd = scanner.nextInt()
            println("Write how many grams of coffee beans you want to add:")
            val beansAdd = scanner.nextInt()
            println("Write how many disposable cups of coffee you want to add:")
            val cupsAdd = scanner.nextInt()

            println("The coffee machine has:\n" +
                "${water + waterAdd} ml of water\n" +
                "${milk + milkAdd} ml of milk\n" +
                "${beans + beansAdd} g of coffee beans\n" +
                "${cups + cupsAdd} disposable cups\n" +
                "$550 of money")
        }

        "take" -> println("""
            I gave you $550
            
            The coffee machine has:
            400 ml of water
            540 ml of milk
            120 g of coffee beans
            9 disposable cups
            $0 of money
            """.trimIndent())
        else -> println("")
    }
}
