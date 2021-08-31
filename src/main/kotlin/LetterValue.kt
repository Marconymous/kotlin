class LetterValue() {

    private val words: List<String>

    init {
        val file = LetterValue::class.java.getResource("words.txt")
        words = file?.readText()?.split("\n") ?: throw Exception("Could not read file!")
    }

    fun get(string: String): Int {
        var total = 0
        val input = string.uppercase()
        for (c in input) {
            total += c.code - 64
        }

        return total;
    }

    fun findFromValue(value: Int): ArrayList<String> {
        val found = ArrayList<String>()

        for (word in words) {
            if (word.length * 26 < value) continue

            val wordVal = get(word)
            if (value == wordVal) found.add(word)
        }

        return found
    }
}