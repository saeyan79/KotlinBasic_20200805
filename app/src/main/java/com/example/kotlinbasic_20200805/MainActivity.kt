package com.example.kotlinbasic_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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
            Log.d("버튼누름", "Click me 눌렸다!")

            Toast.makeText(this, "눌렀네?", Toast.LENGTH_SHORT).show()

        }




        secondBtn.setOnClickListener {
//        두번째 버튼 눌렸을 ㄸㅐ 실행 될 코드
            Log.d("버튼누름", "두번째 버튼 눌렸다!")
            Log.e("에러로그", "실행되면 안되는데 실행됨 error줄임")
            Log.i("정보", "info줄임")

//         두번째 버튼 눌리면 "두번째 버튼 눌림" 문구 짧게 출력하기 Toast 이용
            Toast.makeText(this, "두번째 버튼 눌렀네?", Toast.LENGTH_SHORT).show()
        }

//        복사하기 버튼 눌리면 할 일
        copyBtn.setOnClickListener {

//        Edt에 입력 된 내용 받아와서 (임시 저장) 후,
            val inputMessage = messageEdt.text.toString()

//            5글자 안되면, 토스트로 5자 이상 입력하라고 안내
//            5글자 이상, 10자 이하이면 => Log로 10글자 안된다고 출력
//            그 외의 상황에서는 문구로 반영

            if (inputMessage.length < 5) {
//            5글자 안될 때 => 5글자 이상 입력하라고 토스트로 안내
                Toast.makeText(this, "5자 이상", Toast.LENGTH_SHORT).show()

            } else if (inputMessage.length < 10) {
//            5글자 넘지만 10자 안되는 경우

                Log.d("입력글자수", "5글자 이상, 10글자 미만")
            } else {

//            Txt에 문구로 반영하고 싶음
                copyResultTxt.text = inputMessage
            }


        }

    }
}