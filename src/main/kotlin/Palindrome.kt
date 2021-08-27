class Palindrome {
    companion object {
        fun check(num: Int): Boolean {
            return num == reverse(num)
        }

        private fun reverse(input: Int): Int {
            var reverse = 0
            var num = input
            while (num != 0) {
                reverse = reverse * 10 + num % 10
                num /= 10
            }

            return reverse;
        }
    }
}