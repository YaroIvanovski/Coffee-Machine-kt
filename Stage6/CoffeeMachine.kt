
package machine

import java.util.*

class CoffeeMachine(
    private var water: Int,
    private var milk: Int,
    private var beans: Int,
    private var cups: Int,
    private var money: Int
    ) {

    fun buy() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        when (sc.next()) {
            "1" -> espresso()
            "2" -> latte()
            "3" -> cappuccino()
            else -> {}
        }
    }

    private fun espresso() {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            water -= 250
            beans -= 16
            cups -= 1
            money += 4
            println("I have enough resources, making you a coffee!")
        } else if (water < 250) {
            money -= 4
            println("Sorry, not enough water!")
        } else if (beans < 16) {
            money -= 4
            println("Sorry, not enough coffee!")
        }
    }

    private fun latte() {
        if (water >= 350 && milk >= 75 && beans >= 25 && cups >= 1) {
            water -= 350
            beans -= 20
            milk -= 75
            cups -= 1
            money += 7
            println("I have enough resources, making you a coffee!")
        } else if (water < 350) {
            money -= 7
            println("Sorry, not enough water!")
        } else if (milk < 75) {
            money -= 7
            println("Sorry, not enough milk!")
        } else if (beans < 20) {
            money -= 7
            println("Sorry, not enough coffee!")
        }
    }

    private fun cappuccino() {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            water -= 200
            beans -= 12
            milk -= 100
            cups -= 1
            money += 6
            println("I have enough resources, making you a coffee!")
        } else if (water < 200) {
            money -= 6
            println("Sorry, not enough water!")
        } else if (milk < 100) {
            money -= 6
            println("Sorry, not enough milk!")
        } else if (beans < 12) {
            money -= 6
            println("Sorry, not enough coffee!")
        }
    }

    fun fill() {
        println("Write how many ml of water you want to add:")
        water += sc.nextInt()
        println("Write how many ml of milk you want to add: ")
        milk += sc.nextInt()
        println("Write how many grams of coffee beans you want to add:")
        beans += sc.nextInt()
        println("Write how many disposable cups of coffee you want to add:")
        cups += sc.nextInt()
    }

    fun remaining() {
        println("The coffee machine has:\n" +
                "$water ml of water\n" +
                "$milk ml of milk\n" +
                "$beans g of coffee beans\n" +
                "$cups disposable cups\n" +
                "${"$"}$money of money")
    }

    fun take() {
        println("I gave you $ $money")
        money = 0
    }

    companion object {
        var sc = Scanner(System.`in`)
    }
}