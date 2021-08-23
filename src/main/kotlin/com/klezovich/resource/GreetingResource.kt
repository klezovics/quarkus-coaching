package com.klezovich.resource

import com.klezovich.config.AkConfig
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/greeting")
class GreetingResource {

    @Inject
    lateinit var service:GreetingService

    @Inject
    lateinit var akConfig: AkConfig

    @GET
    fun greet() = service.getGreeting()

    @GET
    @Path("/ak")
    fun ak() = akConfig.wish()
}