package com.engine.design.rules

interface Rule {
    fun validRule(value: Any, actionIf: (() -> Any)? = null, actionElse: (() -> Any)? = null): Double
}