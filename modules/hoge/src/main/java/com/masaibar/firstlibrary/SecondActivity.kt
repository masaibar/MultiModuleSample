package com.masaibar.firstlibrary

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            Intent(context, SecondActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }.let { context.startActivity(it) }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}
