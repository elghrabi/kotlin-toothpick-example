package com.dev.sel_ghrabi.KotlinToothpick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import toothpick.Scope
import toothpick.Toothpick
import javax.inject.Inject

/*
    MainActivity
 */
class BattleOfBastards : AppCompatActivity() {
    //using lateinit because the instance will be associated after injection
    @Inject lateinit var war : War

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Set layout resource
        setContentView(R.layout.activity_main)

        //Scope opening
        val appScope: Scope = Toothpick.openScope(this)

        //Injection
        Toothpick.inject(this, appScope)

        //Click listeners
        btn_prepare.setOnClickListener { txt_war.text = war.prepare() }
        btn_report.setOnClickListener { txt_war.text = war.report() }
    }
}
