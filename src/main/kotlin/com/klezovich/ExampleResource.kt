package com.klezovich

import java.util.*
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello RESTEasy"

    @GET
    @Path("/uuid")
    @Produces(MediaType.TEXT_PLAIN)
    fun uuid() = UUID.randomUUID()
}