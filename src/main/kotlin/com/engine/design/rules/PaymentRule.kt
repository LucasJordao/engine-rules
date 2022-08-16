package com.engine.design.rules

import jakarta.inject.Singleton
import java.math.BigDecimal

@Singleton
class PriceIsLessThen100: Rule {
    override fun validRule(value: Any, actionIf: (() -> Any)?, actionElse: (() -> Any)?): Double {
        if(value is BigDecimal){
            return if(value < BigDecimal.valueOf(100.0)){
                actionIf?.invoke()
                0.0
            }else{
                actionElse?.invoke()
                0.0
            }
        }else{
            throw Exception("Valor não está no formato válido")
        }
    }
}