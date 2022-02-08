package com.example.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ProductTest {
    @Test
    fun product() {
        val product = Product(1, "name")
        assertEquals(1, product.id)
        assertEquals("name", product.name)
    }
}
