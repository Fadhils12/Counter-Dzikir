package com.stups.counterdzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        value.setText("" + id)

        btn_plus.setOnClickListener {
            value.setText("" + ++id)

            /*if (id >= 33){
                value.setText("0")
            }*/
        }

        btn_minus.setOnClickListener {
            value.setText("" + --id)

            if (id <= 0){
                value.setText("0")
            }

        }

        btn_reset.setOnClickListener {
            value.setText("0")
        }
    }
}