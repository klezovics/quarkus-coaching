package com.klezovich.observability;

import io.quarkus.runtime.StartupEvent
import org.eclipse.microprofile.health.HealthCheck
import org.eclipse.microprofile.health.HealthCheckResponse
import org.eclipse.microprofile.health.HealthCheckResponseBuilder
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes

@Readiness
@ApplicationScoped
class ReadinessCheck : HealthCheck {

    var ready = false

    fun onStart(@Observes e:StartupEvent) {
        ready = true
    }

    override fun call(): HealthCheckResponse {
        if(ready) {
            val b = HealthCheckResponse.builder()
            b.up()
            b.name("Main readiness check")
            b.withData("Gotcha", "RAM looks kind of slow")
            return b.build()
        }
        return HealthCheckResponse.down("Not up!")
    }

}
