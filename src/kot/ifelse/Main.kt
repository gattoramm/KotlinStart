package kot.ifelse

fun main() {
    var money = 400
    val food = if (money > 500) {
        money -= 100
        "Пицца"
    } else if (money > 300) {
//        "40"
    } else  {
        "null"
    }
    println(food)
}