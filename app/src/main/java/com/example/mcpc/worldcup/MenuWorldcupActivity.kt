package com.example.mcpc.worldcup

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityMenuWorldcupBinding

class MenuWorldcupActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuWorldcupBinding
    private var imageResources: MutableList<Int> = mutableListOf()
    private var selectedImages: MutableList<Int> = mutableListOf()
    private var clickedImageCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuWorldcupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 이미지 클릭 리스너 설정
        binding.imageView1.setOnClickListener { selectImage(binding.imageView1) }
        binding.imageView2.setOnClickListener { selectImage(binding.imageView2) }

        // 초기 이미지 표시
        initializeImageResources()
        showRandomImages()
    }

    private fun initializeImageResources() {
        imageResources.apply {
            add(R.drawable.menu0)
            add(R.drawable.menu1)
            add(R.drawable.menu2)
            add(R.drawable.menu3)
            add(R.drawable.menu4)
            add(R.drawable.menu5)
            add(R.drawable.menu6)
            add(R.drawable.menu7)
        }
    }

    private fun selectImage(imageView: ImageView) {
        val selectedImageResource = imageView.tag as Int
        selectedImages.add(selectedImageResource)
        clickedImageCount++

        if (clickedImageCount == 1) {
            showRandomImages()
        } else if (clickedImageCount == 4) {
            startWinnerActivity()
        }
    }

    private fun startWinnerActivity() {
        val intent = Intent(this, WinnerActivity::class.java)
        intent.putExtra("selectedImages", ArrayList(selectedImages))
        startActivity(intent)
        // 초기화
        selectedImages.clear()
        clickedImageCount = 0
    }

    private fun showRandomImages() {
        val shuffledImages = imageResources.shuffled()

        // 이미지뷰에 이미지 리소스 ID 및 태그 설정
        binding.imageView1.setImageResource(shuffledImages[0])
        binding.imageView1.tag = shuffledImages[0]

        binding.imageView2.setImageResource(shuffledImages[1])
        binding.imageView2.tag = shuffledImages[1]
    }
}
