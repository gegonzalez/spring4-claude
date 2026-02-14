package org.example

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleAcceptanceTest {
    @Test
    fun `end to end test - success scenario`() {
        // Arrange
        val expectedOutput = "Hello, Kotlin!"

        // Act
        // This is a placeholder for an actual E2E test
        val result = "Hello, Kotlin!"

        // Assert
        assertTrue(result.contains("Kotlin"))
    }
}
