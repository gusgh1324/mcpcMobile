package com.example.mcpc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.databinding.ActivityMainBinding
import com.example.mcpc.join.JoinActivity
import com.example.mcpc.join.LoginActivity
import com.example.mcpc.worldcup.MenuWorldcupActivity
import com.example.mcpc.util.setBinding

// 회원가입, 로그인, 끝내기
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityMainBinding::inflate)

        binding.btnLogin.setOnClickListener{startActivity(Intent(applicationContext, LoginActivity::class.java)) }
        binding.btnJoin.setOnClickListener{startActivity(Intent(applicationContext, JoinActivity::class.java))  }
        binding.btnExit.setOnClickListener{finish()}
    }
}