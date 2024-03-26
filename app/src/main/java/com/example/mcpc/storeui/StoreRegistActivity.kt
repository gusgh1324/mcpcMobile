package com.example.mcpc.storeui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.databinding.ActivityStoreRegistBinding
import com.example.mcpc.util.setBinding

// 가게 가입 액티비티
// 가게상호, 위치, 카테고리, 전화번호
class StoreRegistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityStoreRegistBinding::inflate)
    }
}