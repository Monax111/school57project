package com.example.demo.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import kotlin.math.log2


@RestController
class ScoringController {

    @PostMapping("/score")
    fun score(@RequestBody client: Client): Double {
        return (client.age - 18 * 0.0323) +
                client.education.ordinal * 0.17 +
                log2(client.email.length.toDouble()) +
                client.salary / 500
    }
}

data class Client(
    val age: Int,
    val name: String,
    val email: String,
    val education: Education,
    val salary: Int
)

enum class Education {
    School,
    University,
}