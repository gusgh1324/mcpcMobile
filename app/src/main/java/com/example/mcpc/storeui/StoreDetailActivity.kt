package com.example.mcpc.storeui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.util.setBinding

// 스토어 로그인 이후 화면
// 메뉴 사진, 가격 추가
class StoreDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityStoreDetailBinding::inflate)
    }
}