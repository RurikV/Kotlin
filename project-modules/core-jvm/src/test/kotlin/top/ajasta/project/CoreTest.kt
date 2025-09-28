package top.ajasta.project

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CoreTest {
    @Test
    fun add_addsTwoNumbers() {
        assertEquals(7, Core.add(3, 4))
    }
}
