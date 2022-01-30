
package machine

import java.util.*
import kotlin.system.exitProcess

fun main() {
    val scanner = Scanner(System.`in`)
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550
    var action: String?
    while (true) {
        println("Write action (buy, fill, take, remaining, exit):")
        action = scanner.next()
        when (action) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                val num = scanner.next()
                var newWater = 0
                var newBeans = 0
                val newMoney = 0
                var newMilk = 0
                val newCups = 1
                when (num) {
                    "1" -> {
                        newWater += 250
                        newBeans += 16
                        money += 4
                        if (water >= newWater && beans >= newBeans && cups >= newCups) {
                            water -= newWater
                            beans -= newBeans
                            cups -= newCups
                            money += newMoney
                            println("I have enough resources, making you a coffee!")
                        } else if (water < newWater) {
                            money -= 4
                            println("Sorry, not enough water!")
                        } else if (beans < newBeans) {
                            money -= 4
                            println("Sorry, not enough coffee!")
                        }
                    }
                    "2" -> {
                        newWater += 350
                        newMilk += 75
                        newBeans += 20
                        money += 7
                        if (water >= newWater && milk >= newMilk && beans >= newBeans && cups >= newCups) {
                            water -= newWater
                            beans -= newBeans
                            milk -= newMilk
                            cups -= newCups
                            money += newMoney
                            println("I have enough resources, making you a coffee!")
                        } else if (water < newWater) {
                            money -= 7
                            println("Sorry, not enough water!")
                        } else if (milk < newMilk) {
                            money -= 7
                            println("Sorry, not enough milk!")
                        } else if (beans < newBeans) {
                            money -= 7
                            println("Sorry, not enough coffee!")
                        }
                    }
                    "3" -> {
                        newWater += 200
                        newMilk += 100
                        newBeans += 12
                        money += 6
                        if (water >= newWater && milk >= newMilk && beans >= newBeans && cups >= newCups) {
                            water -= newWater
                            beans -= newBeans
                            milk -= newMilk
                            cups -= newCups
                            money += newMoney
                            println("I have enough resources, making you a coffee!")
                        } else if (water < newWater) {
                            money -= 6
                            println("Sorry, not enough water!")
                        } else if (milk < newMilk) {
                            money -= 6
                            println("Sorry, not enough milk!")
                        } else if (beans < newBeans) {
                            money -= 6
                            println("Sorry, not enough coffee!")
                        }
                    }
                    else -> {}
                }
            }
            "fill" -> {
                println("Write how many ml of water you want to add:")
                val waterAdd = scanner.nextInt()
                println("Write how many ml of milk you want to add: ")
                val milkAdd = scanner.nextInt()
                println("Write how many grams of coffee beans you want to add:")
                val coffeeAdd = scanner.nextInt()
                println("Write how many disposable cups of coffee you want to add:")
                val cupsAdd = scanner.nextInt()
                water += waterAdd
                milk += milkAdd
                beans += coffeeAdd
                cups += cupsAdd
            }
            "take" -> {
                println("I gave you $ $money")
                money = 0
            }
            "remaining" -> println("The coffee machine has:\n" +
                    "$water ml of water\n" +
                    "$milk ml of milk\n" +
                    "$beans g of coffee beans\n" +
                    "$cups disposable cups\n" +
                    "${"$"}$money of money ")
            "exit" -> exitProcess(0)
        }
    }
}
