package com.example.mcpc.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.CarouselActivity
import com.example.mcpc.HomeActivity
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

        binding.btnReg.setOnClickListener{
            //유효성 검사

            //로그인 완료후 이전 모든스택 종료
            val intent = Intent(applicationContext, CarouselActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
        binding.btnRegBack.setOnClickListener{finish()}
    }
}