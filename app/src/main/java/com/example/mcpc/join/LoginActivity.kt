package com.example.mcpc.join

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mcpc.R
import com.example.mcpc.databinding.ActivityLoginBinding
import com.example.mcpc.databinding.ActivityMainBinding
import com.example.mcpc.databinding.ActivityStoreDetailBinding
import com.example.mcpc.storeui.StoreLoginActivity
import com.example.mcpc.ui.UserLoginActivity
import com.example.mcpc.util.setBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = setBinding(ActivityLoginBinding::inflate)

        binding.btnUserLogin.setOnClickListener{startActivity(Intent(applicationContext, UserLoginActivity::class.java)) }
        binding.btnStoreLogin.setOnClickListener{startActivity(Intent(applicationContext, StoreLoginActivity::class.java))  }
        binding.btnExit.setOnClickListener{finish()}
    }
}

