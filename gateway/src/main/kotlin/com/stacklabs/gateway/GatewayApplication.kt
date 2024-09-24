package com.stacklabs.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext

@SpringBootApplication
class GatewayApplication {
    companion object {
        lateinit var applicationContext: ApplicationContext
    }
}

fun main(args: Array<String>) {
    GatewayApplication.applicationContext = runApplication<GatewayApplication>(*args)
    GatewayApplication.applicationContext.beanDefinitionNames.forEach { println(it) }
}
