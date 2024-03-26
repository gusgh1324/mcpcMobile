package com.example.mcpc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityReviewBinding
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.util.setBinding

// 리뷰 게시판
// 글쓰기 버튼, 끝내기 버튼
class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityReviewBinding::inflate)
    }
}