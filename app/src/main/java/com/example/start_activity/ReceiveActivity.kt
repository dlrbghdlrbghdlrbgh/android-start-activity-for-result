package com.example.start_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.start_activity.databinding.ActivityMainBinding
import com.example.start_activity.databinding.ActivityReceiveBinding

class ReceiveActivity : AppCompatActivity() {

    // binding 변수 선언
    private lateinit var binding: ActivityReceiveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_receive)

        binding.exitButton.setOnClickListener {

            /**
             * 1) 버튼 클릭시 결과값을 입력하고 ReceiveActivity 가 종료되도록 코드를 작성하세요
             *
             * activity의 종료는 finish() 함수를 실행하면 됩니다
             */

//            val intent = Intent()
//
//            intent....
//            setResult(5000, ...)
//
//            finish()

        }

    }
}