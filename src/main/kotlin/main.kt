fun main() {
    val purchaseAmount = 12000.0
    val monthlyCustomer = true

    val discount = calculateDiscount(purchaseAmount, monthlyCustomer)
    val totalAmount = purchaseAmount - discount

    println("Сумма покупки: $purchaseAmount руб.")
    println("Скидка: $discount руб.")
    println("Итого к оплате: $totalAmount руб.")
//    println("$")
}

fun calculateDiscount(amount: Double, monthlyCustomer: Boolean): Double {
    return when {
        amount in 0.0..1000.0 -> 0.0
        amount in 1001.0..10000.0 -> {
            val baseDiscount = 100.0
            val additionalDiscount = if (monthlyCustomer) (amount - baseDiscount) * 0.01 else 0.0
            baseDiscount + additionalDiscount
        }

        else -> {
            val baseDiscount = amount * 0.05
            val additionalDiscount = if (monthlyCustomer) (amount - baseDiscount) * 0.01 else 0.0
            baseDiscount + additionalDiscount
        }
    }
}
