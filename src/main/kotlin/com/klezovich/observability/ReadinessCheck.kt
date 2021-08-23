package com.klezovich.observability;

import io.quarkus.runtime.StartupEvent
import org.eclipse.microprofile.health.HealthCheck
import org.eclipse.microprofile.health.HealthCheckResponse
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
        if(ready) return HealthCheckResponse.up("All good!")
        return HealthCheckResponse.down("Not up!")
    }

}
