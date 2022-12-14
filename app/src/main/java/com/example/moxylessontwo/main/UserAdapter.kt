package com.example.moxylessontwo.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moxylessontwo.R
import com.example.moxylessontwo.model.GithubUser

class UserAdapter(): RecyclerView.Adapter<GithubUserViewHolder>() {

    public var users: List<GithubUser> = emptyList()

        @SuppressLint("notifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubUserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
        return GithubUserViewHolder(view)
    }

    override fun onBindViewHolder(holder: GithubUserViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount() = users.size

}

class GithubUserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    private val tvLogin by lazy { itemView.findViewById<TextView>(R.id.userLogin) }

    fun bind(item: GithubUser) = with(item){
       tvLogin.text = login

    }
}