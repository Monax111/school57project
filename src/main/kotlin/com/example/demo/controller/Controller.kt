package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class Controller {

    @GetMapping("/calculate/{a}/{b}")
    fun findById(@PathVariable a: Long, @PathVariable b: Long): Long {
        return a + b
    }

}
