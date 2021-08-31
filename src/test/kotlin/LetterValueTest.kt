import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LetterValueTest {

    @Test
    fun get() {
        val lv = LetterValue()

        assertEquals(lv.get("a"), 1)
        assertEquals(lv.get("z"), 26)
        assertEquals(lv.get("cab"), 6)
        assertEquals(lv.get("excellent"), 100)
    }
}