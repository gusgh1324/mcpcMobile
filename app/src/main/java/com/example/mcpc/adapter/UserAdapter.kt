package com.example.mcpc.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mcpc.R
import com.example.mcpc.vo.UserVO

class UserAdapter: RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    private var list : ArrayList<UserVO> = ArrayList<UserVO>()
    fun setUList(list: ArrayList<UserVO>): Unit {this.list = list}
    fun addUser(vo: UserVO){ list.add(vo); notifyDataSetChanged()}
    fun setUser(position: Int, vo: UserVO){list.set(position, vo); notifyDataSetChanged()}
    fun getUser(position: Int): UserVO{return list.get(position)}

    var handler: OnUserItemClickHandler? = null
    fun setItemClickHandler(handler: OnUserItemClickHandler){this.handler = handler}
    inner class UserViewHolder(private val userView : View): RecyclerView.ViewHolder(userView){

        var uNum: TextView = userView.findViewById(R.id.uNum)
        var uId: TextView = userView.findViewById(R.id.uId)
        var uPw: TextView = userView.findViewById(R.id.uPw)
        var uName: TextView = userView.findViewById(R.id.uName)
        var uAge: TextView = userView.findViewById(R.id.uAge)
        var uMobile: TextView = userView.findViewById(R.id.uMobile)

        init {
            userView.setOnClickListener {
                handler?.onItemClick(this, userView, adapterPosition)
            }
        }
        fun setUser(vo: UserVO): Unit{
            uNum.text = vo.uNum.toString()
            uId.text = vo.uId
            uPw.text = vo.uPw
            uName.text = vo.uName
            uAge.text = vo.uAge.toString()
            uMobile.text = vo.uMobile
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val userVO = list.get(position)
        holder.setUser(userVO)
    }
}