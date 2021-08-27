package tests

fun main() {
    println(Palindrome.check(78)).toString()

    val count = {
        for (i in 0..10) {
            println(i)
        }
    }

    count.invoke()
    count()
}