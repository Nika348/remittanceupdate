const val PENNIES = 100.0

fun main() {
    println("укажите тип карты:")
    println("1. Mastercard и Maestro")
    println("2. Visa и Мир")
    println("3. Vk Pay")
    val card = readLine()!!.toInt()

    println("Введите сумму перевода в этом месяце:")
    val month = readLine()!!.toInt()

    print("Введите смму перевода: ")
    val price = readLine()!!.toInt()

    val amount = (commission(card, month, price)) * PENNIES
    println("Сумма комиссии составила: $amount копеек")
}

fun commission(card: Int, month: Int, price: Int): Double {
    val sum = card + month
    val amount = when (card) {
        1 -> if (sum > 75000) {
            ((sum * 0.6) / 100) + 20
        } else 0.0
        2 -> if (price > 35) {
            (price * 0.75) / 100
        } else 0.0
        3 -> 0.0
        else -> 0.0
    }

    return amount
}
