
package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Write how many ml of water the coffee machine has: ")
    val water = scanner.nextInt()
    println("Write how many ml of milk the coffee machine has:")
    val milk = scanner.nextInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val beans = scanner.nextInt()
    println("Write how many cups of coffee you will need:")
    val cups = scanner.nextInt()
    val minW = water / 200
    val minM = milk / 50
    val minB = beans / 15
    val minRes = minW.coerceAtMost(minM).coerceAtMost(minB)
    if (minRes == cups) {
        println("Yes, I can make that amount of coffee")
    } else if (minRes < cups) {
        println("No, I can make only $minRes cup(s) of coffee")
    } else if (minRes > cups) {
        val more = minRes - cups
        println("Yes, I can make that amount of coffee (and even $more more than that)")
    }
}
