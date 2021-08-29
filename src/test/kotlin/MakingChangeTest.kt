import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MakingChangeTest {

    @Test
    fun change() {
        val m = MakingChange()
        val calc = arrayOf(
            m.change(0),
            m.change(12),
            m.change(468),
            m.change(123456)
        )

        val correct = arrayOf(0, 3, 11, 254)

        assertArrayEquals(calc, correct)
    }
}