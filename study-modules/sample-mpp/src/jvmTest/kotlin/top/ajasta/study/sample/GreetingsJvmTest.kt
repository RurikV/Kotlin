package top.ajasta.study.sample

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GreetingsJvmTest {
    @Test
    fun commonGreeting_returnsExpected() {
        assertEquals("Hello, KMP from KMP!", commonGreeting("KMP"))
    }
}
