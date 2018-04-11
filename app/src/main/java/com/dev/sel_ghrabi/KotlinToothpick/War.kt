package com.dev.sel_ghrabi.KotlinToothpick

import javax.inject.Inject

/*
    War.kt
    -----------------------
    Constructor injection using @Inject
 */
class War @Inject constructor(val starks: Starks, val boltons: Boltons) {

    fun prepare(): String = "${starks.prepareForWar()} \n ${boltons.prepareForWar()}"

    fun report(): String = "${starks.reportForWar()} \n ${boltons.reportForWar()}"

}