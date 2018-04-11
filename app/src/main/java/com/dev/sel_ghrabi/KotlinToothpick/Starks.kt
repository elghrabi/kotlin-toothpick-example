package com.dev.sel_ghrabi.KotlinToothpick

import javax.inject.Inject

/*
    Starks.kt
    -----------------------
    Constructor injection using @Inject
 */
class Starks @Inject constructor() : House {

    override fun prepareForWar(): String {
        return "${this.javaClass.simpleName} prepared for war"
    }

    override fun reportForWar(): String {
        return "${this.javaClass.simpleName} reporting.."
    }
}