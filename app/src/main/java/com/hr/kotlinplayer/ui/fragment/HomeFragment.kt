package com.hr.kotlinplayer.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.hr.kotlinplayer.R
import com.hr.kotlinplayer.adapter.HomeAdapter
import com.hr.kotlinplayer.base.BaseFragment
import com.hr.kotlinplayer.util.URLProviderUtil
import kotlinx.android.synthetic.main.fragment_home.*
import org.jetbrains.anko.debug

class HomeFragment:BaseFragment() {
    override fun initView(): View {
        return View.inflate(context,R.layout.fragment_home,null)
    }

    override fun initListener() {
        recyclerView.layoutManager = LinearLayoutManager(context)
        var homeAdapter = HomeAdapter()
        recyclerView.adapter = homeAdapter


        var homeUrl = URLProviderUtil.getHomeUrl(0, 20)
        debug { homeUrl }
    }
}