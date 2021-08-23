package com.klezovich.resource

import io.quarkus.test.junit.QuarkusTest
import io.quarkus.test.junit.mockito.InjectMock
import io.restassured.RestAssured.given
import org.hamcrest.Matchers.contains
import org.hamcrest.Matchers.containsString
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`

@QuarkusTest
internal class GreetingResourceTest {

    @InjectMock
    lateinit var greetingService: GreetingService

    @Test
    fun testGreeting() {
        `when`(greetingService.getGreeting())
            .thenReturn("AK Hello!")

        given()
            .`when`().get("/greeting")
            .then()
            .statusCode(200)
            .body(containsString("AK Hello!"))
    }
}