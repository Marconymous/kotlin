class MakingChange {
    private val coins = arrayOf(500, 100, 25, 10, 5, 1)

    fun change(amount: Int): Int {
        var coinIndex = 0

        fun subtract(amount: Int, coin: Int, coinCount: Int = 0): Int {
            return when {
                amount == 0 -> {
                    coinCount;
                }
                amount - coin < 0 -> {
                    subtract(amount, coins[++coinIndex], coinCount)
                }
                else -> {
                    subtract(amount - coin, coin, coinCount + 1)
                }
            }
        }

        return subtract(amount, coins[coinIndex])
    }
}
