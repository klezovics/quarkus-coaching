package com.klezovich.resource

import org.eclipse.microprofile.config.inject.ConfigProperty
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    @ConfigProperty(name="greeting.name")
    lateinit var name:String

    @ConfigProperty(name="greeting.suffix", defaultValue = "MAS!")
    lateinit var suffix:String

    @ConfigProperty(name="greeting.prefix")
    lateinit var prefix: Optional<String>

    fun getGreeting() = """${prefix.orElseGet { "??" }} Hello from $name $suffix"""
}