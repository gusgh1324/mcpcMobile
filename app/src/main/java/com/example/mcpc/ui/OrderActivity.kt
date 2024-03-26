package com.example.mcpc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityOrderBinding
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.util.setBinding

// 가게 주문 액티비티
class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityOrderBinding::inflate)
    }
}