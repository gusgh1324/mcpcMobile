package com.example.mcpc.adapter

import android.view.View

interface OnStoreItemClickHandler {
    fun onItemClick(holder: StoreAdapter.StoreViewHolder, v: View, idx: Int)
}