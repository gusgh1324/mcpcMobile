package com.example.mcpc.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mcpc.R
import com.example.mcpc.vo.StoreVO

class StoreAdapter : RecyclerView.Adapter<StoreAdapter.StoreViewHolder>(){
    private var list : ArrayList<StoreVO> = ArrayList<StoreVO>()
    fun setSList(list: ArrayList<StoreVO>): Unit {this.list = list}
    fun addStore(vo: StoreVO){list.add(vo); notifyDataSetChanged()}
    fun setStore(position: Int, vo: StoreVO){list.set(position, vo); notifyDataSetChanged()}
    fun getStore(position: Int): StoreVO {return list.get(position)}

    var handler: OnStoreItemClickHandler? = null
    fun setItemClickHandler(handler: OnStoreItemClickHandler){this.handler = handler}
    inner class StoreViewHolder(private val storeView: View): RecyclerView.ViewHolder(storeView){
        var sNum: TextView = storeView.findViewById(R.id.sNum)
        var sId: TextView = storeView.findViewById(R.id.sId)
        var sPw: TextView = storeView.findViewById(R.id.sPw)
        var uName: TextView = storeView.findViewById(R.id.sName)
        var uMobile: TextView = storeView.findViewById(R.id.sMobile)

        init {
            storeView.setOnClickListener {
                handler?.onItemClick(this, storeView, adapterPosition)
            }
        }
        fun setStore(vo: StoreVO): Unit{
            sNum.text = vo.sNum.toString()
            sId.text = vo.sId
            sPw.text = vo.sPw
            uName.text = vo.sName
            uMobile.text = vo.sMobile
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        val storeVO = list.get(position)
        holder.setStore(storeVO)
    }
}