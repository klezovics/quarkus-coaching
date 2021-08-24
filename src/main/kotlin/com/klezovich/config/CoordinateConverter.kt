package com.klezovich.config;

import org.eclipse.microprofile.config.spi.Converter
import java.util.*
import javax.enterprise.context.ApplicationScoped

class CoordinateConverter : Converter<Coordinate> {

    override fun convert(value: String?): Coordinate {
        value!!
        val tokens = value.split(",")
        return Coordinate(tokens[0].toInt(), tokens[1].toInt())
    }
}

class Coordinate(var x: Int, var y: Int)
