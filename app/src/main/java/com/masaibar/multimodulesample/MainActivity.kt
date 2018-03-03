package com.masaibar.multimodulesample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.masaibar.firstlibrary.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_open_second_activity.setOnClickListener {
            SecondActivity.start(this)
        }
    }
}
