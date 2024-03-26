package com.example.mcpc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.R

// 유저 회원가입페이지
// 아이디, 비밀번호, 이름, 나이, 전화번호
class UserRegistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_regist)
    }
}