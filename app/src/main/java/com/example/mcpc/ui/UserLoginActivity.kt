package com.example.mcpc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.databinding.ActivityUserLoginBinding
import com.example.mcpc.util.setBinding

// 유저 로그인창
// 로그인버튼 클릭 > HomeActivity 이동
class UserLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityUserLoginBinding::inflate)
    }
}