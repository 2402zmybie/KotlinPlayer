package com.hr.kotlinplayer.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hr.kotlinplayer.widget.HomeItemView

class HomeAdapter: RecyclerView.Adapter<HomeAdapter.HomeHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
        return HomeHolder(HomeItemView(parent.context))
    }

    override fun getItemCount(): Int {
       return 20
    }

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {
       //赋值操作
    }

    class HomeHolder(itemView: HomeItemView):RecyclerView.ViewHolder(itemView) {

    }
}