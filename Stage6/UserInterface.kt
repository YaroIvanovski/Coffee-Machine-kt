
package machine

import java.util.*

class UserInterface(coffeeMachine: CoffeeMachine, sc: Scanner) {
    private val sc: Scanner
    private val coffeeMachine: CoffeeMachine

    init {
        this.coffeeMachine = coffeeMachine
        this.sc = sc
    }

    fun start() {
        println("Write action (buy, fill, take, remaining, exit):")
        var action = sc.next()
        while (true) {
            if (action == "buy") {
                coffeeMachine.buy()
            }
            if (action == "take") {
                coffeeMachine.take()
            }
            if (action == "fill") {
                coffeeMachine.fill()
            }
            if (action == "remaining") {
                coffeeMachine.remaining()
            }
            if (action == "exit") {
                break
            }
            println()
            println("Write action (buy, fill, take, remaining, exit): ")
            action = sc.next()
        }
    }
}