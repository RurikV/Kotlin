package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun `greet returns Hello, World`() {
        assertEquals("Hello, World!", greet())
    }
}
