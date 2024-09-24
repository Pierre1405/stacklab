package com.stacklabs.gateway.controllers

import com.stacklabs.gateway.dto.HelloWorld
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController()
class HelloWorldController {

    @GetMapping(path = ["/hello/{name}/"])
    fun helloName(@PathVariable name: String): HelloWorld {
        return HelloWorld(name)
    }

    @GetMapping(path = ["/helloworld/"])
    fun helloWorld(): String {
        return "hello world"
    }
}