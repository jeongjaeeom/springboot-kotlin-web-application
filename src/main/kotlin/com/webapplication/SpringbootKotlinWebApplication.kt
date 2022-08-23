package com.webapplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootKotlinWebApplication

fun main(args: Array<String>) {
    runApplication<SpringbootKotlinWebApplication>(*args)
}
