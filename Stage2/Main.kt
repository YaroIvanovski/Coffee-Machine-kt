
package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val water = 200
    val milk = 50
    val beans = 15
    println("For " + input + " cups of coffee you will need:\n" +
                input * water + " ml of water\n" +
                input * milk + " ml of milk\n" +
                input * beans + " g of coffee beans")
}