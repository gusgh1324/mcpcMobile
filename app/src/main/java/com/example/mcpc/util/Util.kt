package com.example.mcpc.util

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

inline fun <reified T : ViewBinding> AppCompatActivity.setBinding(
    crossinline bindingInflater: (LayoutInflater) -> T
): T {
    val inflater = LayoutInflater.from(this)
    val binding = bindingInflater(inflater)
    setContentView(binding.root)
    return binding
}

