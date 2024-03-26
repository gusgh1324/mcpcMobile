package com.example.mcpc.storeui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.HomeActivity
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityLoginBinding
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.databinding.ActivityStoreLoginBinding
import com.example.mcpc.ui.UserLoginActivity
import com.example.mcpc.util.setBinding

// 스토어 로그인 화면
class StoreLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityStoreLoginBinding::inflate)

        binding.btnReg.setOnClickListener{
            //로그인 완료후 이전 모든스택 종료
            val intent = Intent(applicationContext, StoreDetailActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
        binding.btnRegBack.setOnClickListener{finish()}

    }
}