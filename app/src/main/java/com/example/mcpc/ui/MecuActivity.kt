package com.example.mcpc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityMecuBinding
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.util.setBinding

// 메뉴추천 액티비티
class MecuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityMecuBinding::inflate)
    }
}