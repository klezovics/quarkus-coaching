package com.klezovich.config

import io.quarkus.arc.config.ConfigProperties
import io.smallrye.config.ConfigMapping
import org.eclipse.microprofile.config.inject.ConfigProperty
import javax.enterprise.context.ApplicationScoped
import javax.inject.Singleton

@ConfigMapping(prefix = "ak")
interface AkConfig {

     fun wish():String

}