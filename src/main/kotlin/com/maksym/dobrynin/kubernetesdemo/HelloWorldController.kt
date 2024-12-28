package com.maksym.dobrynin.kubernetesdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping
    fun index(): String {
        return "Hello, world!"
    }
}