package com.example.mcpc.adapter

import android.view.View

interface OnUserItemClickHandler {
    fun onItemClick(holder: UserAdapter.UserViewHolder, v: View, idx: Int)
}