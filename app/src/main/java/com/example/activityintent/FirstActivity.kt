package com.example.activityintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        var btn = findViewById<Button>(R.id.buttonFirstActivity)
        btn.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
    /**
     * 버튼 클릭 이벤트 처리
     * @param view : 클릭된 버튼 객체
     *
     * 클릭된 버튼 객체가 무엇인지를 id를 통해 인지하여, 두 가지 다른 인텐트 객체를 생성
     */
    fun doOnBtnClick(view: View) {
        when (view.getId()) {
            R.id.buttonDialActivity -> {                 // 114 전화번호로 다이얼 작업을 수행할 수 있도록 인텐트 설정
                val call_intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:114"))
                startActivity(call_intent)
            }
            R.id.buttonMapActivity -> {                // 주어진 위도,경도 위치로 지도를 보여줄 수 있도록 인텐트 설정
                val map_intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.565350, 127.01445"))
                startActivity(map_intent)
            }
        }
    }
}