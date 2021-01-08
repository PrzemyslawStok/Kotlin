package com.example.SimpleSecure

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleSecureApplication

fun main(args: Array<String>) {
	runApplication<SimpleSecureApplication>(*args)
}
