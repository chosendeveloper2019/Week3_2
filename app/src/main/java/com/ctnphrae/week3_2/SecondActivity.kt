package com.ctnphrae.week3_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // ดึงข้อมูลจาก intent
        var name = intent.extras.getString(MainActivity().TAG_NAME)
        var lname = intent.extras.getString(MainActivity().TAG_LNAME)

        tv_result_name.setText(name)
        tv_result_lname.setText(lname)

        btn_back.setOnClickListener {
            finish()
        }

    }
}