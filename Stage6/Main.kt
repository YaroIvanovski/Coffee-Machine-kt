
package machine

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val coffeeMachine = CoffeeMachine(400, 540, 120, 9, 550)
    val ui = UserInterface(coffeeMachine, sc)
    ui.start()
}
