package com.example.mcpc.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.databinding.ActivityUserRegistBinding
import com.example.mcpc.join.LoginActivity
import com.example.mcpc.util.setBinding

// 유저 회원가입페이지
// 아이디, 비밀번호, 이름, 나이, 전화번호
class UserRegistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityUserRegistBinding::inflate)

        binding.btnReg.setOnClickListener{startActivity(Intent(applicationContext, UserLoginActivity::class.java))}
        binding.btnRegBack.setOnClickListener{finish()}
    }
}