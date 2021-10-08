package com.klezovich.beans

import io.quarkus.arc.profile.IfBuildProfile
import io.quarkus.arc.profile.UnlessBuildProfile
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Produces

@ApplicationScoped
class Config {

    @Produces
    @UnlessBuildProfile("prod")
    fun testCoolBean(): MyCoolBean {
        return MyCoolBean("This is a test bean")
    }
}