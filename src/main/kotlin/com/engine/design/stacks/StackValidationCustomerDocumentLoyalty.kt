package com.engine.design.stacks

import com.engine.design.Order
import com.engine.design.rules.PriceIsLessThen100
import jakarta.inject.Singleton

@Singleton
class StackValidationCustomerDocumentLoyalty(
        private val priceIsLessThen100: PriceIsLessThen100
): StackValidation {
    override fun validStack(order: Order): Double {
        priceIsLessThen100.validRule(order.valor, teste) { println("Teste Else") }

        return 0.0
    }

    val teste = {
        println("testeIf")
    }
}