package com.engine.design

import com.engine.design.stacks.StackValidation
import com.engine.design.stacks.StackValidationCustomerDocumentLoyalty
import jakarta.inject.Singleton
import java.math.BigDecimal

@Singleton
class Engine (
        private val stackValidationCustomerDocumentLoyalty: StackValidationCustomerDocumentLoyalty
){

    fun valid(order: Order){
        var stacks: MutableSet<StackValidation>? = null
        var scoreTotal: Double = 0.0

        when(order.channel.uppercase()){
            "LOYALTY" -> stacks = mutableSetOf(stackValidationCustomerDocumentLoyalty)
            "ITAUSHOP" -> stacks = mutableSetOf()
            else -> stacks = null
        }

        stacks?.forEach{stack ->
            scoreTotal += stack.validStack(order)
        }
    }
}

data class Order(
        val valor: BigDecimal,
        val channel: String
)