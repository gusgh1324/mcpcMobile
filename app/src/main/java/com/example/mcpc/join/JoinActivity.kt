package com.example.mcpc.join

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityJoinBinding
import com.example.mcpc.databinding.ActivityLoginBinding
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.storeui.StoreLoginActivity
import com.example.mcpc.storeui.StoreRegistActivity
import com.example.mcpc.ui.UserLoginActivity
import com.example.mcpc.ui.UserRegistActivity
import com.example.mcpc.util.setBinding

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var binding = setBinding(ActivityJoinBinding::inflate)

        binding.btnUserJoin.setOnClickListener{startActivity(Intent(applicationContext, UserRegistActivity::class.java)) }
        binding.btnStoreJoin.setOnClickListener{startActivity(Intent(applicationContext, StoreRegistActivity::class.java))  }
        binding.btnExit.setOnClickListener{finish()}
    }
}