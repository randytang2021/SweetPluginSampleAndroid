package com.sweet.plugin.sample

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        // test pass
        assertEquals("com.sweet.plugin.sample.test", appContext.packageName)
    }
    @Test
    fun useAppContextFail() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        // test fail.
        assertEquals("com.sweet.plugin.sample.test", appContext.packageName)
    }
}