package com.fitkle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FitkleBackendApplication

fun main(args: Array<String>) {
    runApplication<FitkleBackendApplication>(*args)
}
