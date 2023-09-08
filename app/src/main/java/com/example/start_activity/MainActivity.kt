package com.example.start_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.start_activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // binding 변수 선언
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil
            .setContentView(this, R.layout.activity_main)

        binding.execute.setOnClickListener {

            val intent = Intent(this, ReceiveActivity::class.java)

            startActivityForResult(intent, 5000)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        /**
         * resultCode가 5000일 때
         * data에 담긴 값을 binding.resultMessage에 넣는 코드를 작성하세요
         */
//
//        if(...){
//            data.get...
//            binding.resultMessage ...
//        }

    }
}