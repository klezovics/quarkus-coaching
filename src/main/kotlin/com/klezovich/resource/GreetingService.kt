package com.klezovich.resource

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    fun getGreeting() = "Hello from service"
}