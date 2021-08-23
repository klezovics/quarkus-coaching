package com.klezovich.resource

import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/greeting")
class GreetingResource {

    @Inject
    lateinit var service:GreetingService

    @GET
    fun greet() = service.getGreeting()
}