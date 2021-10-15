package com.kim.kt_kim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickbtn.setOnClickListener {
//             코드에 메모 남기기 - 주석

            Log.d("메인화면로그", "클릭용 버튼 눌림")
        }
    }
}