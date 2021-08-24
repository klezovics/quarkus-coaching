package com.klezovich

import com.klezovich.config.Coordinate
import org.eclipse.microprofile.config.inject.ConfigProperty
import org.postgresql.core.Oid.JSON
import java.util.*
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

    @ConfigProperty(name = "treasure.location")
    lateinit var treasure:Coordinate

    @GET
    @Path("/treasure")
    fun treasure() = "${treasure.x},${treasure.y}"


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

    @GET
    @Path("/header")
    fun getHeaderParam(@HeaderParam("Secret") secret:String?): String {
        println("Secret is $secret")
        if(secret == null) return "NoSecret"
        return secret
    }

    @GET
    @Path("/path/{id}")
    fun getPathId(@PathParam("id") id:String):String {
        return id
    }

}