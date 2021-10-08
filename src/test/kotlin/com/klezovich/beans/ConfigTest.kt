package com.klezovich.beans

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import javax.inject.Inject

@QuarkusTest
internal class ConfigTest {

    @Inject
    lateinit var myCoolBean: MyCoolBean


    @Test
    fun testCorrectBeanInjected() {
        assertEquals("This is a test bean", myCoolBean.msg())
    }
}