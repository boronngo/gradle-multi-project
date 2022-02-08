package com.example.app

import com.example.domain.Product
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppApplication

fun main(args: Array<String>) {
    Product(1, "name")
    runApplication<AppApplication>(*args)
}
