package com.example.mcpc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.databinding.ActivityMainBinding

// 회원가입, 로그인, 끝내기
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}