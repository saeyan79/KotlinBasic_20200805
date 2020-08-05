package com.example.kotlinbasic_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Ctrl + / : 해당 줄을 주석으로
//        메모처럼 주석을 적자
//        xml에 그려둔 clickme 버튼 눌렀을때 감지하기

    clickMeBtn.setOnClickListener {
//        지금 코드에 회색 바탕으로 나오는 것들은 자동 입력되는것으로 신경 쓸 필요 없음. 따라적지도 마
//        이 중괄호 내부의 코드 => clickMeBtn 눌리면 실행 될 코드 적는 곳
        Log.d("버튼누름", "눌렸다!")
    }

    }
}