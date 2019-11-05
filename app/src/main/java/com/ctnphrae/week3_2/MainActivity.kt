package com.ctnphrae.week3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_NAME:String = "NAME"
    public final var TAG_LNAME :String  = "LNAME"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("แอพแรกของ")
        btn_sender.setOnClickListener {
            //การดึงค่าจาก EditText
            var name = et_name.text.toString()
            var lname = et_lastname.text.toString()
            //ส่งข้อมูล
            sentderFun(name,lname)

        }

        btn_clear.setOnClickListener {
            // ล้างข้อมูล
            clearFun()

        }
    }

    fun sentderFun(arg1 : String , arg2 : String){
        // กำหนดค่าเริ่มต้น            (Mainactivityหรือ this , Class ปลายทาง)
        var goPageSecoud  = Intent(this,SecondActivity::class.java)
        //การฝากข้อมูล  (ชื่อของข้อมูล , ข้อมูลที่ต้องการส่ง)
        goPageSecoud.putExtra(TAG_NAME,arg1)
        goPageSecoud.putExtra(TAG_LNAME,arg2)
        //เริ่มต้นเปลี่ยนหน้า
        startActivity(goPageSecoud)
    }

    fun clearFun(){
        et_name.setText("")
        et_lastname.setText("")
    }

}
