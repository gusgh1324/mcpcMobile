package com.example.mcpc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.databinding.ActivityHomeBinding
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.join.LoginActivity
import com.example.mcpc.ui.MecuActivity
import com.example.mcpc.ui.MenuWorldcupActivity
import com.example.mcpc.ui.OrderActivity
import com.example.mcpc.ui.ReviewActivity
import com.example.mcpc.util.setBinding

// 유저 로그인 이후 화면
// 메뉴추천, 월드컵, 리뷰게시판, 끝내기 버튼
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityHomeBinding::inflate)

        binding.btnMecu.setOnClickListener{startActivity(Intent(applicationContext, MecuActivity::class.java)) }
        binding.btnWrold.setOnClickListener{startActivity(Intent(applicationContext, MenuWorldcupActivity::class.java)) }
        binding.btnOrder.setOnClickListener{startActivity(Intent(applicationContext, OrderActivity::class.java)) }
        binding.btnReview.setOnClickListener{startActivity(Intent(applicationContext, ReviewActivity::class.java)) }
    }
}