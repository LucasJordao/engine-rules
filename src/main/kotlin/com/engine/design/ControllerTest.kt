package com.engine.design

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.math.BigDecimal

@Controller("/test")
class ControllerTest(
        private val engine: Engine
) {
    @Get
    fun teste(){
        val order = Order(BigDecimal.valueOf(100.0), "Loyalty")
        engine.valid(order)
    }
}