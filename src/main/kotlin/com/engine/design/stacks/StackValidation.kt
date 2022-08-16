package com.engine.design.stacks

import com.engine.design.Order

interface StackValidation {
    fun validStack(order: Order): Double
}