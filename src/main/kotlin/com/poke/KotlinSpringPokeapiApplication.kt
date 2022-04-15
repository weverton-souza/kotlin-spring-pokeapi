package com.poke

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringPokeapiApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringPokeapiApplication>(*args)
}
