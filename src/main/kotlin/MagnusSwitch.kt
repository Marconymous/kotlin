class MagnusSwitch {
    companion object {
        fun switchTest() {
            for (i in 0 until 10) {
                when (i) {
                    0 -> println("zero")
                    1 -> println("one")
                    2 -> println("two")
                    else -> {
                        println("more than two")
                    }
                }
            }
        }
    }
}