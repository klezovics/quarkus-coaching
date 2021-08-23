package com.klezovich.resource

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.Matchers.contains
import org.hamcrest.Matchers.containsString
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

@QuarkusTest
internal class GreetingResourceTest {

    @Test
    fun testGreeting() {
        given()
            .`when`().get("/greeting")
            .then()
            .statusCode(200)
            .body(containsString("Hello"))
    }
}