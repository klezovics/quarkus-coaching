package com.klezovich

import org.postgresql.core.Oid.JSON
import java.util.*
import javax.ws.rs.*
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

    @POST
    fun post() = "Post received"

    @GET
    @Path("/car")
    @Produces(MediaType.APPLICATION_JSON)
    fun getCar() = Car()

    class Car(val name:String="BMW") {

    }

    @POST
    @Path("/body")
    @Consumes(MediaType.APPLICATION_JSON)
    fun postBody(body:String):String {
        println("Body is $body")
        return body
    }

    @GET
    @Path("/param")
    fun getParam(@QueryParam("param") param:String?) = """{"param: "${param?:"unknown"}"}"""


}