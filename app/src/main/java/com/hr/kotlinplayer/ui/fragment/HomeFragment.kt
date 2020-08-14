package com.hr.kotlinplayer.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.hr.kotlinplayer.R
import com.hr.kotlinplayer.base.BaseFragment

class HomeFragment:BaseFragment() {
    override fun initView(): View {
        return View.inflate(context,R.layout.fragment_home,null)
    }
}