import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.math.exp

internal class PalindromeTest {
    @Test
    fun check() {
        val truthy = booleanArrayOf(
            Palindrome.check(1),
            Palindrome.check(22),
            Palindrome.check(323),
            Palindrome.check(4334),
            Palindrome.check(54345),
            Palindrome.check(654456),
            Palindrome.check(7654567),
        )

        val falsy = booleanArrayOf(
            Palindrome.check(12),
            Palindrome.check(123),
            Palindrome.check(1234),
            Palindrome.check(12345),
            Palindrome.check(123456),
            Palindrome.check(1234567),
        )

        val actual = arrayOf(
            truthy, falsy
        )

        val expected = arrayOf(
            booleanArrayOf(
                true, true, true, true, true, true, true
            ),
            booleanArrayOf(
                false, false, false, false, false, false
            )
        )

        for (i in 0..1) {
            assertArrayEquals(actual[i], expected[i])
        }
    }
}