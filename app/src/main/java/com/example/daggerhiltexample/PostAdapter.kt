package com.example.daggerhiltexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter:RecyclerView.Adapter<PostAdapter.MyViewHolder>() {

    var liveData:List<Post>?=null

    fun setList(data:List<Post>){
        this.liveData = data
    }

    class MyViewHolder(view:View):RecyclerView.ViewHolder(view){
        val titleText:TextView = view.findViewById(R.id.title)
        val bodyText:TextView = view.findViewById(R.id.body)
        fun bindItems(post:Post){
            titleText.text=post.title
            bodyText.text=post.body
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(liveData!!.get(position))
    }

    override fun getItemCount(): Int {
        if (liveData == null){
            return 0
        }else{
            return liveData!!.size
        }
    }
}