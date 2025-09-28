package top.ajasta.study

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UtilsTest {
    @Test
    fun greet_returnsExpected() {
        assertEquals("Hello, World!", Utils.greet("World"))
    }
}
