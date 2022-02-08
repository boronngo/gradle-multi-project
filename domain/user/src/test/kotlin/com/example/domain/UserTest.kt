package com.example.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UserTest {
    @Test
    fun product() {
        val user = User(1, "name")
        Assertions.assertEquals(1, user.id)
        Assertions.assertEquals("name", user.name)
    }
}
